# Design Patterns - Singleton

## 1/ Definition:
A Singleton is a design pattern that restricts the instantiation of a class to a single instance and provides a global point of access to that instance. This is useful when exactly one object is needed to coordinate actions across the system.

## 2/ Initialization Methods:
### 2.1/ Eager Initialization:
In this method, the instance of the class is created at the time of class loading. This is simple and thread-safe, but it can lead to resource wastage if the instance is never used.

[Eager Initialization](EagerInitializedSingleton.java)

