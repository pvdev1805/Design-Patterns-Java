package patterns.singleton.initializations;

public class ThreadSafeLazyInitializedSingleton {
    // Singleton instance
    private static volatile ThreadSafeLazyInitializedSingleton instance;

    // Private constructor to avoid client applications to use the constructor
    private ThreadSafeLazyInitializedSingleton() {}

    // Public method to provide access to the instance
    public static synchronized ThreadSafeLazyInitializedSingleton getInstance(){
        if (instance == null) {
            instance = new ThreadSafeLazyInitializedSingleton();
        }
        return instance;
    }
}
