package designPartterns.singleton.inner;

public class Singleton {
    private static class SingletonHolder {
        public static Singleton uniqueInstance = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.uniqueInstance;
    }
}
