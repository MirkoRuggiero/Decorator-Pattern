package patterns.creational.singleton;

public class SingletonTest {
    public static void main(String[] args) {

        Singleton eagerSingleton = Singleton.getEagerInstance();
        System.out.println(eagerSingleton.getSerialId());
        eagerSingleton = Singleton.getEagerInstance();
        System.out.println(eagerSingleton.getSerialId());


        Singleton lazySingleton = Singleton.getLazyInstance();
        System.out.println(lazySingleton.getSerialId());
        lazySingleton = Singleton.getLazyInstance();
        System.out.println(lazySingleton.getSerialId());
    }
}
