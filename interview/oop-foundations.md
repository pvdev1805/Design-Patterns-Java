# OOP Foundations — Interview Questions and Sample Answers

These answers are starting points. Practise explaining them naturally rather than memorising word-for-word.

## What is a class in Java?

**Sample answer:** A class defines the structure and behaviour shared by objects of that type. It can declare fields, constructors, and methods.

## What is an object?

**Sample answer:** An object is a runtime instance of a class, with its own state and identity. A reference variable can refer to an object.

## What is encapsulation?

**Sample answer:** Encapsulation groups state and related behaviour and controls access to internal details. It helps an object maintain valid state and reduces dependencies on its implementation.

## Are private fields and getters/setters sufficient?

**Sample answer:** Not necessarily. Unrestricted setters can expose internal state changes that violate business rules. Meaningful operations such as `withdraw()` or `sell()` allow an object to validate changes itself.

## What is an object invariant?

**Sample answer:** An object invariant is a condition that should hold whenever an object is in a valid observable state. For example, a product's stock must not be negative.

## Encapsulation vs information hiding?

**Sample answer:** Encapsulation combines related data and behaviour behind an interface. Information hiding is the design principle of concealing decisions that clients should not depend on. Encapsulation can support information hiding.

## Follow-up exercise

Explain why a `BankAccount` class should usually expose `deposit()` and `withdraw()` instead of an unrestricted `setBalance()`. Discuss validation, consistency, and testability.
