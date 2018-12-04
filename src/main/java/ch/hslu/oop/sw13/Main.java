package ch.hslu.oop.sw13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);
    private static List<WorkerCallable> wclist = new ArrayList<>();
    private static List<Future<Integer>> flist = new ArrayList<>();
    private static List<Future<Integer>> rlist = new ArrayList<>();

    private static void waitForCompletion( Thread[] threads) {
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Worker worker1 = new Worker("worker1", 1000);
        Worker worker2 = new Worker("worker2", 1000);
        Worker worker3 = new Worker("worker3", 1000);

        LOG.info("Starting synchron workjobs:");
        LOG.info("worker1 finished in: " + worker1.processWork());
        LOG.info("Worker2 finished in: " + worker2.processWork());
        LOG.info("Worker3 finished in: " + worker3.processWork());

        LOG.info("Starting asynchron workjobs");
        worker1.startAsThread();
        worker2.startAsThread();
        worker3.startAsThread();


        int i = 0;
        while ( i < 10) {
            wclist.add(new WorkerCallable(new Worker("worker" + i, 1000)));
            i++;
        }

        LOG.info("List with " +wclist.size() + " WorkerCallable stored.");

        final ExecutorService execSvc = Executors.newFixedThreadPool(10);

        for (WorkerCallable wc : wclist) {
            final Future<Integer> result = execSvc.submit(wc);
            flist.add(result);

        }

        for (Future<Integer> f : flist) {
            try {
                LOG.info(" Result von worker: " + f.get());
                rlist.add(f);
            } catch (ExecutionException e) {
                e.toString();
            } catch (InterruptedException e) {
                e.toString();
            }
        }



        for (Future<Integer> f : rlist) {
            LOG.info(f.get());
        }

        execSvc.shutdown();
        final Counter counter = new Counter();
        final Thread[] threads = new Thread[3];
        for (int j = 0; j < threads.length; j++) {
            threads[j] = new Thread(new Worker(counter));
        }
        for (Thread thread : threads) {
            thread.start();
        }

        waitForCompletion(threads);

        LOG.info("Zählerstand: " + counter.getCount());


    }

}
