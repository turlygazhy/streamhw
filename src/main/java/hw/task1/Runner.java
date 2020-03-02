package hw.task1;

public class Runner {
    public static void main(String[] args) {
        Runnable runnable1 = () -> System.out.println(String.format("Thread %s, runnable #1", Thread.currentThread().getName()));
        Runnable runnable2 = () -> System.out.println(String.format("Thread %s, runnable #2", Thread.currentThread().getName()));
        Runnable runnable3 = () -> System.out.println(String.format("Thread %s, runnable #3", Thread.currentThread().getName()));
        new Thread(runnable1).start();
        new Thread(runnable2).start();
        new Thread(runnable3).start();
    }
}
