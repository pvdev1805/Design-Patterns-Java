# Day 01 Exercise — Encapsulate a Product

## Goal

Refactor a data-only `Product` class into an object that protects its own invariants.

## Starter design

```java
public class Product {
    public String name;
    public double price;
    public int stock;
}
```

## Requirements

1. `name` must not be null or blank.
2. `price` must be greater than zero and finite.
3. `stock` must never be negative.
4. Clients sell products through `sell(int quantity)`.
5. Selling more units than available must fail.
6. Clients can read price and stock.
7. Do not expose `setStock()`.
8. Decide whether a controlled price update operation is justified.

## Interview follow-up

Explain in English: **Why are private fields plus unrestricted setters insufficient for good encapsulation?**

## How to practise

Create your own `Product` implementation before reading the reference solution. Write tests for normal operations and invalid inputs.
