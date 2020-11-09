# Kotlinish composition over inheritance

This is a small example of the composition over inheritance principle in kotlin. 

This repository contains a `CountingSet` which keeps track of the total number of added elements. The inheritance based
approach lefts one failing test because the `addAll`-method do not work like expected.
This problem can be solved using the `by` keyword in kotlin.

## :books: Resources
- [Kotlin Delegation](https://kotlinlang.org/docs/reference/delegation.html)
