package patterns.singleton.initializations;

public class Main {
    public static void main(String[] args) {
        // Create an instance of EagerInitializedSingleton
        EagerInitializedSingleton eagerSingleton = EagerInitializedSingleton.getInstance();
        System.out.println("Eager Initialized Singleton Instance: " + eagerSingleton);

        // Create an instance of StaticBlockSingleton
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        System.out.println("Static Block Singleton Instance: " + staticBlockSingleton);

        // Create an instance of LazyInitializedSingleton
        LazyInitializedSingleton lazySingleton = LazyInitializedSingleton.getInstance();
        System.out.println("Lazy Initialized Singleton Instance: " + lazySingleton);
    }
}
