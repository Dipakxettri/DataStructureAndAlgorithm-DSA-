# Bubble Sort 

1. **Overview**:
   - Bubble Sort is a simple comparison-based sorting algorithm.
   - It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

2. **Steps**:
   - **Step 1**: Start from the first element of the array.
   - **Step 2**: Compare the current element with the next element.
   - **Step 3**: Swap if the current element is greater than the next.
   - **Step 4**: Continue this process for each adjacent pair, moving the largest element to the end of the array.
   - **Step 5**: Repeat the above steps for the rest of the array, ignoring the last sorted elements.
  
   - use two loops outer(i) and inner (j) 

3. **Key Points**:
   - **Pass-by-Pass Sorting**: After each pass through the array, the largest element "bubbles" up to its correct position.
   - **Optimized Version**: The process can stop early if no swaps are made in a pass, indicating the array is already sorted.
   - **Time Complexity**: Worst and average case time complexity is O(n²).
   - **Space Complexity**: O(1) (in-place sorting).
   - **Best Use Case**: Small datasets or when simplicity is prioritized over efficiency.

4. **Example**:
   - Array: `[5, 2, 9, 1, 5, 6]`
   - **Pass 1**: `[2, 5, 1, 5, 6, 9]` (9 is sorted)
   - **Pass 2**: `[2, 1, 5, 5, 6, 9]` (6 is sorted)
   - **Pass 3**: `[1, 2, 5, 5, 6, 9]` (No more swaps needed, array is sorted)
