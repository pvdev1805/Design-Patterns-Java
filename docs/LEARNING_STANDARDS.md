# Learning Content Standards

## Purpose
Maintain a consistent, practical learning track for Java object-oriented design, SOLID and GoF patterns, including English technical interview preparation.

## Lesson deliverables
Each completed day includes theory, runnable examples, exercises, reference solutions, automated tests where meaningful, and interview Q&A. Use the templates in [templates/](templates/) as guides, not rigid length requirements.

## Organisation
- Theory: `docs/phase-01-oop-foundations/day-01-classes-objects-encapsulation.md` and equivalent phase paths.
- Pattern catalogue: `docs/phase-03-design-patterns/<category>/<pattern>.md`; link from the roadmap rather than duplicate theory.
- Examples: `src/main/java/com/learning/designpatterns/foundations/day01/`, `solid/day08/`, or `patterns/<category>/<pattern>/` beneath the same package root.
- Tests: mirror the corresponding production package under `src/test/java/`.
- Exercises: `exercises/phase-01/day-01/problem.md`, `starter/` and `solution.md`.
- Reference implementations: canonical Java source under the relevant Maven package, in an `exercise` or `solution` subpackage when useful.
- Interview questions: phase-level files in `interview/`, organised by day headings.

Use zero-padded day numbers in paths. Java package names are lowercase and contain no hyphens.

## Writing and code quality
Use clear English (Australian spelling in prose where practical), precise definitions, realistic examples and explicit trade-offs. Label intentionally naive or unsafe code. Avoid pattern use without a demonstrated need. Link to canonical code instead of maintaining duplicate full implementations. Add references only for sources actually consulted.

## Testing and build
Use Java 25 and JUnit Jupiter. Test normal, invalid and boundary cases where appropriate. `mvn clean verify` checks Maven source roots, not standalone starter files under `exercises/`. Never claim that sequential identity tests prove concurrency safety.

## Existing content transition
The original Day 01 notes, standalone Product solution and Singleton implementations remain unchanged in this milestone. During Day 01 completion, migrate the Product reference implementation into the Maven source tree, add tests and replace the old standalone solution with a linked explanation. Review Singleton in Day 29.

## Definition of done
A day is complete when its theory, examples, practice, solution, applicable tests and interview Q&A are reviewed; links work; Maven verification passes; and changes are committed and reviewed. Mark the roadmap only after completion.
