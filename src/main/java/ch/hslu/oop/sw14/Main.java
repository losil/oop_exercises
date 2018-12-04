package ch.hslu.oop.sw14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);
    private static List<Callable> wclist = new ArrayList<>();
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

 /*   while ( i < 10) {
        wclist.add(Callable < Integer > () -> {
            return new Worker("worker", 1000).slow();
        });
    }*/

    public static void main(String args[] ) {
        Worker worker1 = new Worker("worker", 1000);
        worker1.startAsThread();
    }


}
