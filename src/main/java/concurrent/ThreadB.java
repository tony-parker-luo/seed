package concurrent;

public class ThreadB implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(100000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();

        System.out.println("Thread name: " + name);
        System.out.println("active num: "+ Thread.activeCount());
        System.out.println("id: "+ currentThread.getId());
        System.out.println("priority: "+ currentThread.getPriority());
        System.out.println("group: "+ currentThread.getThreadGroup());
        System.out.println("isAlive: "+ currentThread.isAlive());
        System.out.println("isDaemon: "+ currentThread.isDaemon());
        System.out.println("=====================================");

    }
}
