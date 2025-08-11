package patterns.singleton.initializations;

public class DoubleCheckLockingSingleton {
    // Singleton instance
    private static volatile DoubleCheckLockingSingleton instance;

    // Private constructor to avoid client applications to use the constructor
    private DoubleCheckLockingSingleton() {
    }

    // Public method to provide access to the instance
    public static DoubleCheckLockingSingleton getInstance() {
        if (instance == null) {
            // Block other threads from entering this block
            synchronized (DoubleCheckLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
