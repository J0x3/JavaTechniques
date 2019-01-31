package singleton;

public class Main {

    public static void main()
    {
        // classic
        Singleton instanceClassic_1 = Singleton.getInstance();
        Singleton instanceClassic_2 = Singleton.getInstance();
        // .....

        // lazy
        SingletonLazyLoad instanceLazy_1 = SingletonLazyLoad.getInstance();
        SingletonLazyLoad instanceLazy_2 = SingletonLazyLoad.getInstance();
        // .....

    }
}
