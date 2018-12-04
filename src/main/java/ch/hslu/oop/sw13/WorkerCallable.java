package ch.hslu.oop.sw13;

import java.util.concurrent.Callable;

public class WorkerCallable implements Callable<Integer> {
    private Worker worker;

    public WorkerCallable(Worker worker) {
        this.worker = worker;

    }
    @Override
    public Integer call() {
        return worker.slow();
    }

}
