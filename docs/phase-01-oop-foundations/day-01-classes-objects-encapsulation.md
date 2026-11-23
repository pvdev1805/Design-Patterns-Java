# Design Patterns with Java Learning Track
## Phase 1: Object-Oriented Design Foundations
### Day 1 - Class, Object & Encapsulation
#### 1. Object-Oriented Programming (OOP) Overview
> **What is Object-Oriented Programming (OOP)?**

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of wrapping pieces of data, and behavior related to that data, into special bundles called objects.

#### 2. Class and Object
##### 2.1. Class 
> **What is a Class?**

A class is a blueprint or template that defines the state and behavior of objects.

Example:
```java
public class BankAccount {

    private String accountNumber;
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
```
In this example, the `BankAccount` class defines the **state** (account number and balance) and **behavior** (deposit() and withdraw() methods) of bank account objects. But the `BankAccount` class itself is NOT a specific bank account.

##### 2.2. Object
> **What is an Object?**

An object is an instance of a class that has its own state and can perform behaviors defined by that class.

Example:
```java
BankAccount account1 = new BankAccount();
BankAccount account2 = new BankAccount();
```
In this example, `account1` and `account2` are two distinct objects (instances) of the `BankAccount` class. Each object has its own state (account number and balance) and can perform behaviors (deposit and withdraw).

##### 2.3. Class vs Object
> What is the difference between a class and an object?

A class is a blueprint that defines the structure and behaviour of objects, while an object is a concrete instance of that class created at runtime.

##### 2.4. State and Behavior
> What is the state of an object?

The state of an object represents the data or values it currently holds.

In the `BankAccount` example, the state of an object is represented by its `accountNumber` and `balance`.
Assuming `account1` has an account number of "12345" and a balance of $1000, then after applying `account1.deposit(500)`, the state of `account1` would be:
- accountNumber: "12345"
- balance: $1500

> What is the behavior of an object?

Behaviour represents the actions an object can perform, usually through its methods.

In the `BankAccount` example, the behavior of an object is represented by its `deposit()` and `withdraw()` methods. For instance, calling `account1.deposit(500)` changes the state of `account1` by increasing its balance by $500.

#### 3. Encapsulation
> What is Encapsulation?

Encapsulation is the bundling of data (state) and methods (behaviour) that operate on that data within a single unit, typically a class.

#### 4. Object Invariant
> What is an Object Invariant?

An object invariant is a condition that must remain true throughout the valid lifetime of an object.

Example:
Assuming we have a `BankAccount` class, an object invariant could be that the balance should never be negative. This means that any operation that modifies the balance must ensure that it does not violate this condition.

```java
public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                    "Initial balance cannot be negative"
            );
        }

        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Deposit amount must be positive"
            );
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal amount must be positive"
            );
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Insufficient funds"
            );
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
```
