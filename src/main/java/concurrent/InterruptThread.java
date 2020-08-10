package concurrent;

public class InterruptThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            boolean stop = false;
            while (!stop) {
                System.out.println("My thread is running......");
                long time = System.currentTimeMillis();
                while (System.currentTimeMillis() - time < 1000) {

                }
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
            }
            System.out.println("My thread exiting under request......");
        }, "Interrupt Thread");

        System.out.println("Starting thread......");
        thread.start();
        Thread.sleep(3000L);
        System.out.println("Interrupt thread......");
        thread.interrupt();
        System.out.println("isInterrupted: " + thread.isInterrupted());
        Thread.sleep(3000);
        System.out.println("Stopping application......");
    }
}
