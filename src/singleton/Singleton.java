package singleton;

public final class Singleton {

    // private constructor
    private Singleton() {}

    // static instance of class
    private static final Singleton INSTANCE = new Singleton();

    // get the instance
    public static Singleton getInstance()
    {
        return INSTANCE;
    }
}
