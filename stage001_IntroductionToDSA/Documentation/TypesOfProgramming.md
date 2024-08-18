# Types of Programming Paradigms

Programming paradigms are different approaches or styles for solving problems and organizing code. Below are some common paradigms:

## 1. **Procedural Programming**

A paradigm that focuses on the sequence of steps or procedures to solve a problem. It emphasizes the use of functions or procedures to operate on data.

**Concepts**:
- **Functions**: Blocks of code that perform specific tasks.
- **Procedures**: A series of computational steps to be carried out.
- **State**: Data is typically stored in variables and manipulated by functions.

## 2. **Functional Programming**

Functional programming is a programming style where functions are the main building blocks. It emphasizes the following:

**Concepts**:
1. **First-Class Functions**: Functions can be passed around and used like other values (e.g., numbers and strings).
   
2. **Immutability**: Data cannot be changed after it's created. Instead of modifying data, new data is created.

3. **Pure Functions**: Functions return the same result for the same input and have no side effects (e.g., they don't modify external variables).

4. **Function Composition**: Combining simple functions to build more complex functions.

5. **Recursion**: Using functions that call themselves to perform repetitive tasks instead of loops.
double(3)); // Result is 7

## 3. **Object-Oriented Programming (OOP)**

**Concepts**:
- **Object**: An instance of a class that contains data (attributes) and methods (functions) to operate on the data.

- **Class**: A blueprint for creating objects, defining attributes and methods.

- **Inheritance**: Mechanism where one class (child) inherits attributes and methods from another class (parent), enabling code reuse.

- **Encapsulation**: Bundles data and methods into a single unit (class) and restricts direct access to some of the object's components, enhancing data protection.

- **Polymorphism**: Allows methods to do different things based on the object they are acting upon, using a common interface for different underlying forms.

## Static vs. Dynamic Memory Management

- **Static Memory Management**:
  - **Allocation**: Memory is allocated at compile time.
  - **Deallocation**: Memory is automatically managed and deallocated when the program ends or the variable goes out of scope.
  - **Example**: Local variables in functions, global variables, static arrays.
  - **Characteristics**: Fixed size, predictable, but inflexible in terms of resizing.

- **Dynamic Memory Management**:
  - **Allocation**: Memory is allocated at runtime using functions like `malloc` (C) or `new` (C++/Java).
  - **Deallocation**: Programmer must manually deallocate memory using `free` (C) or `delete` (C++), or garbage collection handles it in languages like Java.
  - **Example**: Dynamic arrays, linked lists, trees.
  - **Characteristics**: Flexible size, can grow or shrink as needed, but requires careful management to avoid memory leaks.
