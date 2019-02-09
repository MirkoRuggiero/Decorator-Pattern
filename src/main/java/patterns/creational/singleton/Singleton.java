package patterns.creational.singleton;

import java.util.concurrent.ThreadLocalRandom;

public class Singleton {

    private Long serialId;
    /**
     * Example with eager initialization
     */
    private static final Singleton eagerInstance = new Singleton();

    /**
     * Example with lazy initialization
     */
    private static Singleton lazyInstance;

    /**
     * Costruttore privato! Non accessibile al di fuori della classe stessa
     */
    private Singleton() {
        serialId = ThreadLocalRandom.current().nextLong();
    }

    public static Singleton getEagerInstance() {
        return eagerInstance;
    }

    public static Singleton getLazyInstance() {
        if (lazyInstance != null) return lazyInstance;
        return lazyInstance = new Singleton();
    }

    public Long getSerialId() {
        return serialId;
    }
}
