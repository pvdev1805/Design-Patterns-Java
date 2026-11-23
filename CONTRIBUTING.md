# Contributing

This is primarily a personal learning repository. Corrections and suggestions are welcome.

## Requirements

- Java 25
- Apache Maven
- JUnit Jupiter

## Branch naming

- `chore/` tooling and maintenance
- `docs/` documentation
- `feat/` new examples or lessons
- `test/` tests
- `refactor/` behaviour-preserving refactors
- `fix/` bug fixes

## Conventions

- Write documentation and interview answers in English.
- Use standard Java naming conventions and lowercase package names.
- Keep one public top-level class per `.java` file.
- Prefer small, focused examples over unnecessary abstractions.
- Document both benefits and limitations of patterns.
- Keep intentional naive examples clearly labelled.
- Use tests for meaningful behaviour, not just print statements.

## Validation

```bash
mvn clean verify
```

## Gitmoji commit examples

```text
🏗️ chore: migrate repository to Maven
📝 docs: expand encapsulation lesson
✨ feat: add strategy examples
✅ test: cover singleton identity
```

## Pull requests

Explain the change, affected files, verification performed, and any remaining limitations. Keep unrelated changes in separate pull requests.
