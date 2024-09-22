# Selection Sort

Selection Sort is a simple comparison-based sorting algorithm. It repeatedly selects the smallest (or largest) element from the unsorted portion of the array and swaps it with the first unsorted element, gradually sorting the array.

## Steps:
Use three methods - selection sort,max element and swap methods

1. Find the first minimum element in an array.
3. Swap the found minimum element with the last element of an array Formula : last = array.length - I - 1.
4. Move the boundary of the sorted portion by one element.
5. Repeat the process until the entire array is sorted.

## Time Complexity:
- **Best case**: O(n²)
- **Average case**: O(n²)
- **Worst case**: O(n²)
- **Space Complexity**: O(1) (in-place sorting)

# Bubble Sort vs. Selection Sort

| Feature           | **Bubble Sort**               | **Selection Sort**            |
|-------------------|-------------------------------|-------------------------------|
| **Method**        | Repeatedly swaps adjacent elements if they are in the wrong order. | Selects the smallest/largest element and swaps it with the first unsorted element. |
| **Time Complexity** | O(n²) in all cases            | O(n²) in all cases            |
| **Best Case**      | O(n) (if array is already sorted) | O(n²)                         |
| **Swaps**         | Can perform more swaps         | Fewer swaps, but more comparisons |
| **Stability**     | Stable (preserves order of equal elements) | Not stable (can disrupt order of equal elements) |
| **Space Complexity** | O(1) (in-place)              | O(1) (in-place)               |
| **Use Case**      | Works well when the array is almost sorted | Good for smaller arrays or when fewer swaps are needed. |

