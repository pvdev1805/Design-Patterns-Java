package com.learning.designpatterns.patterns.creational.singleton;

public class SingletonDemo {
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

        // Create an instance of ThreadSafeLazyInitializedSingleton
        ThreadSafeLazyInitializedSingleton threadSafeLazySingleton = ThreadSafeLazyInitializedSingleton.getInstance();
        System.out.println("Thread Safe Lazy Initialized Singleton Instance: " + threadSafeLazySingleton);

        // Create an instance of DoubleCheckLockingSingleton
        DoubleCheckLockingSingleton doubleCheckLockingSingleton = DoubleCheckLockingSingleton.getInstance();
        System.out.println("Double Check Locking Singleton Instance: " + doubleCheckLockingSingleton);
    }
}
