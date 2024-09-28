# Insertion Sort

## What is Insertion Sort?
Insertion Sort is a simple sorting algorithm that builds a sorted array (or list) one element at a time. It is efficient for small data sets and works by dividing the list into a sorted and an unsorted part.

## Steps of Insertion Sort:
1. **Start with the second element**: Assume the first element is already sorted.
2. **Pick the next element**: Take the next element from the unsorted part.
3. **Compare and insert**: Compare the picked element with the elements in the sorted part and shift all larger elements to the right to make space for the picked element.
4. **Insert the element**: Place the picked element in its correct position in the sorted part.
5. **Repeat**: Repeat the process until all elements are sorted.

## Time Complexity:
- **Best Case**: O(n) - when the array is already sorted.
- **Average Case**: O(n²) - for random order.
- **Worst Case**: O(n²) - when the array is sorted in reverse order.

## Space Complexity:
- **O(1)** - Insertion Sort is an in-place sorting algorithm, meaning it requires a constant amount of extra space.

## Comparison with Other Sorting Algorithms:

| Sorting Algorithm | Best Case | Average Case | Worst Case | Space Complexity | Description                       |
|-------------------|-----------|--------------|------------|-------------------|-----------------------------------|
| **Insertion Sort** | O(n)     | O(n²)        | O(n²)      | O(1)              | Good for small or nearly sorted lists. |
| **Bubble Sort**    | O(n)     | O(n²)        | O(n²)      | O(1)              | Simple but inefficient for large lists. |
| **Selection Sort** | O(n²)    | O(n²)        | O(n²)      | O(1)              | Always makes O(n) swaps; inefficient for large lists. |

## Which is Better?
- **Insertion Sort** is better than both Bubble Sort and Selection Sort for small or partially sorted datasets because it is adaptive (works better with partially sorted data) and has a lower overhead.
- **Bubble Sort** and **Selection Sort** are generally less efficient, especially for larger datasets, due to their O(n²) average and worst-case time complexities.

In summary, Insertion Sort is often preferred for its simplicity and efficiency on small datasets or when the input is partially sorted.
