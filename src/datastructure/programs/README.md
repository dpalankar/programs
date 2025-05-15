# Data Structure Programs

**Package Name:** `datastructure.programs`  
This repository contains a list of complex data structure implementations in Java.

---

## 📌 Program: Own HashMap

**Java Classes:**
- `MyHashMap1` // Simple with support of integer
- `MyHashMap2` // Load factor
- `MyHashMap3` // Generic Approach

Create your own `HashMap` class using the following interface:

```java
interface MyHash {
    int get(int key);
    void remove(int key);
    int put(int key, int value);
}
```

---

## 📌 Program: Rope Data Structure

**Java Classes:**
- `RopeDataStructure`

Implement the Rope data structure for storing and manipulating long strings efficiently.

---

## 📌 Program: LeastMax Replacement

**Java Classes:**
- `ReplaceWithLeastGreater`
- `ReplaceWithLeastGreater1`
- `ReplaceWithLeastGreaterBinary`

Replace each element in array 2 with the least greater element from array 1.

**Example:**

```java
int[] arr1 = [3, 4, 7, 5];
int[] arr2 = [2, 4, 6, 8];
int[] Output = [3, 5, 7, 8]
```

---

## 📌 Program: HashMap Transaction

**Java Classes:**
- `TransactionalHashMap`

Implement a `HashMap` with transactional operations that support:

- `put`
- `get`
- `begin`
- `commit`
- `rollback`

---

## 📌 Program: Bracket Validator

**Java Classes:**
- `BracketValidator`

Check if the brackets in a given string are correctly balanced.

**Examples:**

```java
String a = "a[b]bc(}b})";     // Output: Invalid
String a = "a[b]bc(fd){b}";   // Output: Valid
```

---

## 📌 Program: LRU Cache

**Java Classes:**
- `LRUCache`
- `LRUCacheMain`

Design a data structure that follows the constraints of a **Least Recently Used (LRU)** cache.

**API Specification:**

```java
LRUCache(int capacity)          // Initialize the LRU cache with positive size capacity.
int get(int key)                // Return the value of the key if it exists, else return -1.
void put(int key, int value)    // Update the key if it exists, else insert. Evict LRU if over capacity.
```

**Constraints:**
- Both `get` and `put` must run in **O(1)** average time complexity.

---

## 📌 Program: RightViewofTree

**Java Classes:**
- `RightViewOfBinaryTree`

The Right View of a Binary Tree refers to the set of nodes visible when the tree is viewed from the right side.

**Examples: 1,3,6,7**

```
                 1
                / \
               2   3
              / \   \
             4   5   6
                      \
                       7
```

---