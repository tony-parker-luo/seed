package thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
//        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        ExecutorService threadPool = Executors.newCachedThreadPool();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            threadPool.submit(() -> {
                System.out.println(" Thread ID: " + Thread.currentThread().getId());
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            });
        }
        threadPool.shutdown();
        while (!threadPool.isTerminated()) {
        }
        long endTime = System.currentTimeMillis();
        System.out.println("datetime: " + (endTime - startTime) + "ms");
    }
}
