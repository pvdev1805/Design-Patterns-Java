package patterns.singleton.initializations;

public class LazyInitializedSingleton {
    // Singleton instance
    private static LazyInitializedSingleton instance;

    // Private constructor to avoid client applications to use the constructor
    private LazyInitializedSingleton() {
    }

    // Public method to provide access to the instance
    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
