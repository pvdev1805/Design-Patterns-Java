package patterns.singleton.initializations;

public class EagerInitializedSingleton {
    // Eagerly initialized singleton instance
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();



    // Private constructor to avoid client applications to use the constructor
    private EagerInitializedSingleton() {
    }

    // Public method to provide access to the instance
    public static EagerInitializedSingleton getInstance(){
        return INSTANCE;
    }
}
