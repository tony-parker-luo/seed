package designPartterns.singleton.dcl;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
    }
}
