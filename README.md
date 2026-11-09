# package-kotlin

Kotlin/JVM reference library with a Maven build, tests, and a console example.

## Layout

| Path | Holds |
| --- | --- |
| `src/main/kotlin/` | publishable library |
| `src/test/kotlin/` | JUnit 5 tests |
| `examples/console-app/` | console example |
| `docs/` | usage and release notes |

## Build

```bash
mvn -q test
```

## Use

```bash
Use `io.github.gardusi.gustavo.kit.Kit` from the built JAR.
```
