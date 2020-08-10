package concurrent;

public class ThreadMain {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(100000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread currentThread = Thread.currentThread();
            System.out.println("=====================================");
            System.out.println("slave thread");

            System.out.println("Thread name: " + currentThread.getName());
            System.out.println("active num: " + Thread.activeCount());
            System.out.println("id: " + currentThread.getId());
            System.out.println("priority: " + currentThread.getPriority());
            System.out.println("group: " + currentThread.getThreadGroup());
            System.out.println("isAlive: " + currentThread.isAlive());
            System.out.println("isDaemon: " + currentThread.isDaemon());
            System.out.println("=====================================");
        });

        for (int i = 0; i < 5; i++) {
            new Thread(thread, "thread" + i).start();
        }
        Thread mainThread = Thread.currentThread();
        System.out.println("=====================================");
        System.out.println("main thread");
        System.out.println("Main thread name: " + mainThread.getName());
        System.out.println("id: " + mainThread.getId());
        System.out.println("priority: " + mainThread.getPriority());
        System.out.println("isAlive: " + mainThread.isAlive());
        System.out.println("isDaemon: " + mainThread.isDaemon());
        System.out.println("=====================================");

        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
