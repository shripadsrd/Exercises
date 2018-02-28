public class Singleton {

    private static Singleton singleton = null;
    private final String SINGLETON_NAME = "Four Thousand Holes!";
    private Singleton() {}

    public static Singleton getInstance() {
        return singleton == null ? singleton = new Singleton() : singleton;
    }

    public String getName() {
        return SINGLETON_NAME;
    }
}
