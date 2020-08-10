package concurrent;

import java.util.concurrent.Callable;

public class CallableThread implements Callable {
    @Override
    public Object call() throws Exception {
        Thread.sleep(1000l);
        System.out.println("This is CallableThread");
        return "CallableThread";
    }
}
