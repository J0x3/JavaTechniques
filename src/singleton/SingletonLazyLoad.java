package singleton;

public class SingletonLazyLoad {

    private static SingletonLazyLoad instance = null;

    // private constructor, protects against instantiation.
    private SingletonLazyLoad() { }

    // created only when called the first time - Lazy Load.
    public static synchronized SingletonLazyLoad getInstance() {
        if (instance == null)
        {
            instance = new SingletonLazyLoad();
        }
        return instance;
    }
}
