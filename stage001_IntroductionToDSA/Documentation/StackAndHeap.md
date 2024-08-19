# Stack vs. Heap

**Stack:** Typically used for static memory allocation, such as local variables and function call frames. Variables stored on the stack are of fixed size and are automatically managed by the system.

**Heap:** Used for dynamic memory allocation, such as objects created with `new` in Java or `malloc` in C. Memory on the heap must be managed manually or by a garbage collector.

## Case Explanations

### Case 1

```java
int a = 10;
```
In this case, a is a local variable stored on the stack, and the value 10 is stored directly in the stack because a is a primitive type. Primitive types in Java (e.g., int, char) are stored on the stack, not on the heap. There is no separate heap allocation for the value 10.

### Case 2

```java
int a = 10;
int b = a;
```
Here, both a and b are local variables stored on the stack. Both a and b have the value 10 copied into them, but they are not referencing the same memory location. With primitive types, copying the value means a and b hold their own separate copies of the value 10.

### Case 3

```java
int a = 10;
a = 20;
```
In this case, a initially holds the value 10. When you update a to 20, a now holds the value 20. The value 10 is no longer referenced by a, but since 10 is a primitive type, there is no separate heap allocation involved. In languages with garbage collection, such as Java, unused objects (if they were on the heap) would be cleaned up by the garbage collector, but this does not apply to primitive types directly.SummaryPrimitive Types: Stored directly on the stack; no heap allocation.Reference Types (Objects): Stored on the heap, with references (or pointers) on the stack.

### Summary
**Primitive Types:** Stored directly on the stack; no heap allocation.

**Reference Types (Objects):**
Stored on the heap, with references (or pointers) on the stack.
