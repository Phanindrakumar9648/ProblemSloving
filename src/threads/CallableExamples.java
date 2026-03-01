package threads;

import java.util.concurrent.*;

public class CallableExamples  {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            System.out.println("Task running in: " + Thread.currentThread().getName());
            return 100;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Main thread continues...");

        Integer result = future.get();  // blocks here

        System.out.println("Result: " + result);

        executor.shutdown();
    }
    }



