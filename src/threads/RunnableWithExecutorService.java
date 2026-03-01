package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableWithExecutorService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task=()->{
            System.out.println("Running in: " + Thread.currentThread().getName());

        };
        executor.submit(task);
        executor.submit(task);

        executor.shutdown();

    }
}
