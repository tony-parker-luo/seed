package concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableThread thread = new CallableThread();

        FutureTask<String> task = new FutureTask<>(thread);

        new Thread(task).start();
        System.out.println("Main Thread start");
        String s = task.get();
        System.out.println(s);
        System.out.println("Main Thread end");
    }
}
