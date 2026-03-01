package threads;

public class RunnableExamples {
    public static void main(String[] args) {

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task is running");
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
