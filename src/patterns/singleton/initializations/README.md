# Design Patterns - Singleton

## 1/ Definition:
A Singleton is a design pattern that restricts the instantiation of a class to a single instance and provides a global point of access to that instance. This is useful when exactly one object is needed to coordinate actions across the system.

## 2/ Initialization Methods:
### 2.1/ Eager Initialization:
In this method, the instance of the class is created at the time of class loading. This is simple and thread-safe, but it can lead to resource wastage if the instance is never used.

[Eager Initialization](EagerInitializedSingleton.java)

### 2.2/ Static Block Initialization:
In this method, the instance is created in a static block. This allows for exception handling during instance creation and is also thread-safe.

[Static Block Initialization](StaticBlockSingleton.java)
