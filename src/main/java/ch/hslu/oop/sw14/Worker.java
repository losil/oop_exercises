package ch.hslu.oop.sw14;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Worker implements Runnable {
    private static Logger LOG = LogManager.getLogger(Worker.class);
    private String name = "worker";
    private int mseconds = 1000;
    private Counter counter;

    public Worker(String name, int mseconds) {
        this.name = name;
        this.mseconds = mseconds;
    }

    Worker(Counter counter) {
        this.counter = counter;
    }


    public int processWork() {
        try {
            Thread.sleep(mseconds);
        }

        catch (InterruptedException e) {
            e.toString();
        }
        return mseconds;

    }

    public void startAsThread() {
        final Thread thread = new Thread( this::processWork );
        thread.start();
    }

    public int slow() {
        int sum = 34 + 45;
        LOG.info("sum is" + sum);
        return sum;
    }

    public void run() {
        for ( int i = 0; i<10000; i++) {
            counter.increment();
        }
    }

    @Override
    public String toString() {
        return "Worker " + this.name;
    }

}

