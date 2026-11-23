package com.learning.designpatterns.patterns.creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonSmokeTest {

    @Test
    void eagerInitializationReturnsSameObject() {
        var first = EagerInitializedSingleton.getInstance();
        var second = EagerInitializedSingleton.getInstance();
        assertNotNull(first);
        assertSame(first, second);
    }

    @Test
    void staticBlockInitializationReturnsSameObject() {
        assertSame(StaticBlockSingleton.getInstance(), StaticBlockSingleton.getInstance());
    }

    @Test
    void lazyInitializationReturnsSameObjectSequentially() {
        assertSame(LazyInitializedSingleton.getInstance(), LazyInitializedSingleton.getInstance());
    }

    @Test
    void synchronizedInitializationReturnsSameObjectSequentially() {
        assertSame(ThreadSafeLazyInitializedSingleton.getInstance(),
                   ThreadSafeLazyInitializedSingleton.getInstance());
    }

    @Test
    void doubleCheckedLockingReturnsSameObjectSequentially() {
        assertSame(DoubleCheckLockingSingleton.getInstance(),
                   DoubleCheckLockingSingleton.getInstance());
    }
}
