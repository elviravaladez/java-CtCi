# CtCi

This is a repository to document my progress while reading "Cracking the Coding Interview" by Gayle Laakmann McDowell.

## Table of Contents

- [Overview](#overview)
    - [The Objective](#the-objective)
    - [Key Concepts](#key-concepts)
- [What I Learned](#what-i-learned)
- [Author](#author)

## Overview

### The Objective

Be able to understand key concepts addressed within the book.

### Key Concepts

- [x] Big O
- [ ] Problem Solving Strategies
- [ ] Data Structures
- [ ] Algorithms
- [ ] Java
- [ ] Databases
- [ ] Threads and Locks

#### [Back To Top](#ctci)

---

## What I Learned

### Big O Notation
Big O describes the efficiency of an algorithm with respect to the time and space complexity. When describing the Big O of an algorithm it is most common to focus on the worst case and expected case for a specific scenario or inputs.


In short, Big O Notation: 
- describes how fast an algorithm grows
- focuses on worst case estimate
- has asymptotic behavior
    - asymptotic means approaching but never connecting with a line or curve


#### Time Complexity
  - The runtime of an algorithm
    - Described with consideration to how fast an algorithm grows relative to the input, as the input gets arbitrarily large
  - Common runtimes include:
    
      | Name | Big O Representation |
      | --------------- | --------------- |
      | Constant Time | `O(1)` |
      | Logarithmic Time | `O(log N)` |
      | Linear Time | `O(N)` |
      | Quadratic Time | `O(N^2)` |
      | Linearithmic Time | `O(N log N)` |
      | Exponential Time | `O(2^N)` |
      | Factorial Time | `O(N!)` |

  

#### Space Complexity
  - The amount of memory (space) an algorithm requires
    - Most primitives (booleans, numbers, undefined, null) are Constant Space or `O(1)` 
    - Strings require `O(N)` space where N is the string’s length
    - Reference types are generally `O(N)`, where N is the length (for arrays) or the number of keys (for HashMaps in Java)
  - Common space complexities include:

    | Name | Big O Representation |
    | --------------- | --------------- |
    | Constant Space | `O(1)` |
    | Logarithmic Space | `O(log N)` |
    | Linear Space | `O(N)` |
    | Quadratic Space | `O(N^2)` |
    | Linearithmic Space | `O(N log N)` |
    | Exponential Space | `O(2^N)` |

#### Drop the Constants

- With Big O, the constants are dropped in runtime. For instance, if you have `O(2N)` it reduces to `O(N)`.

#### Drop the Non-Dominant Terms

- With Big O, the non-dominant (less significant) terms are dropped. For example, if you have `O(N^2 + N)`, the `N` would get dropped because it's the non-dominant term. You would them be left with `O(N^2)`.



#### [Back To Top](#ctci)

---

## Author

### [Elvira Valadez](https://github.com/elviravaladez)

---

#### [Back To Top](#ctci)