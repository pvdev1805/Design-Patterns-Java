# Design Patterns with Java

A structured learning repository for **Object-Oriented Design**, **SOLID principles**, and the **23 Gang of Four (GoF) design patterns**.

The goal is to explain not only *how* a pattern works but also *why* it exists, what trade-offs it introduces, and when it should not be used.

## Technology

- Java 25 (LTS)
- Apache Maven
- JUnit Jupiter
- IntelliJ IDEA (recommended)

## Quick start

```bash
java -version
mvn -version
mvn clean verify
```

Run `SingletonDemo.main()` from your IDE to see the existing Singleton demonstrations.

## Repository map

| Location | Purpose |
|---|---|
| `docs/` | Concept explanations, English definitions, pattern notes |
| `src/main/java/` | Java implementations |
| `src/test/java/` | Automated tests |
| `exercises/` | Exercises and reference solutions |
| `interview/` | English interview questions and sample answers |
| `ROADMAP.md` | Learning progress |
| `CONTRIBUTING.md` | Code and documentation conventions |

## Learning method

1. Understand the problem and vocabulary.
2. Examine a naive solution.
3. Identify its limitations.
4. Apply an appropriate principle or pattern.
5. Compare trade-offs.
6. Practise with exercises and tests.
7. Explain the decision in English.

## Current status

The repository foundation contains migrated Singleton examples and an initial Day 01 note from the original project. These materials are **preserved for later review** rather than presented as final, polished lessons. See [ROADMAP.md](ROADMAP.md).

## Useful starting points

- [Day 01: Classes, Objects and Encapsulation](docs/phase-01-oop-foundations/day-01-classes-objects-encapsulation.md)
- [Singleton notes (original, awaiting review)](docs/phase-03-design-patterns/creational/singleton.md)
- [Day 01 practice](exercises/phase-01/day-01/problem.md)
- [OOP interview practice](interview/oop-foundations.md)

## Scope

This is an educational codebase, not a production banking or e-commerce application. Examples may intentionally show unsafe designs to teach their limitations.
