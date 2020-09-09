package thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(10);
        threadPool.scheduleAtFixedRate(() -> {
            try {
                Thread.sleep(8000);
                System.out.println(System.currentTimeMillis() / 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, 0, 2, TimeUnit.SECONDS);

       /* threadPool.scheduleWithFixedDelay(() -> {
            try {
                Thread.sleep(8000);
                System.out.println(System.currentTimeMillis() / 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, 0, 2, TimeUnit.SECONDS);*/
    }
}
