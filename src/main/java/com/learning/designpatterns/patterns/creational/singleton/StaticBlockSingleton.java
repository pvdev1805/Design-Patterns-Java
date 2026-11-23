package com.learning.designpatterns.patterns.creational.singleton;

public class StaticBlockSingleton {
    // Singleton instance
    private static StaticBlockSingleton instance;

    // Private constructor to avoid client applications to use the constructor
    private StaticBlockSingleton() {
    }

    // Static block for initialization
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating singleton instance");
        }
    }

    // Public method to provide access to the instance
    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
