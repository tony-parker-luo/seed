package concurrent;

public class ThreadExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("An exception has been captured");
        System.out.println("name: " + t.getName() + ", id: " + t.getId());
        System.out.println("Exception: " + e.getClass().getName());
        System.out.println("Message: " + e.getMessage());
        System.out.println("Thread status: " + t.getState());
    }
}
