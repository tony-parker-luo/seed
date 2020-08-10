package concurrent;

public class ExceptionThread {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            int parseInt = Integer.parseInt("TTTT");
        });

        thread.setUncaughtExceptionHandler(new ThreadExceptionHandler());
        thread.start();
    }
}
