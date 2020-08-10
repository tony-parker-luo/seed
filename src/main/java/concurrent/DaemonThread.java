package concurrent;

public class DaemonThread {
    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 999999999L; i++) {
                System.out.println("name: " + Thread.currentThread().getName() + ", " + i + " run");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, "threadA");

        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("name: " + Thread.currentThread().getName() + ", " + i + " run");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }, "threadB");

        threadB.setDaemon(true);
        threadB.start();
        threadA.start();

        Thread mainThread = Thread.currentThread();
        System.out.println(threadA.getName() + " is daemon: " + threadA.isDaemon());
        System.out.println(threadB.getName() + " is daemon: " + threadB.isDaemon());
        System.out.println(mainThread.getName() + " is daemon: " + mainThread.isDaemon());
    }
}
