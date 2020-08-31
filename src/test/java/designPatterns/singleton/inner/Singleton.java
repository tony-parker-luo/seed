package designPatterns.singleton.inner;

public class Singleton {
    private static class SingletonHolder{
        private static final Singleton uniqueInstance = new Singleton();
    }

    private Singleton() {}

    public static Singleton getInstance() {
        return SingletonHolder.uniqueInstance;
    }

}