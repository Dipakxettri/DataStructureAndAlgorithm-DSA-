
## Binary Search

Binary Search is a very efficient way to find an item in a sorted list. Instead of checking every item one by one (like in linear search), binary search divides the list in half and determines which half the item could be in. It then repeats this process, continually cutting the list in half until it finds the item or concludes that the item isn’t in the list.

### Steps to Perform Binary Search

1. **Start with the entire list**:
   - Identify the lowest index (`low`) and the highest index (`high`) of the list. These indices represent the portion of the list you're searching in.

2. **Find the middle element**:
   - Calculate the middle index using the formula:  
     `middle = (low + high) / 2`
   - Check the element at this middle index.

3. **Compare the middle element with the target**:
   - If the middle element is equal to the target, you've found the item!  
   - If the middle element is **greater** than the target, the target must be in the left half of the list. So, update `high` to `middle - 1`.
   - If the middle element is **less** than the target, the target must be in the right half of the list. So, update `low` to `middle + 1`.

4. **Repeat**:
   - Repeat the process with the updated `low` and `high` indices, recalculating the middle index and comparing it with the target.
   - Continue this until `low` is greater than `high`, which means the item isn’t in the list.

5. **End**:
   - If you find the target, return its index.
   - If `low` becomes greater than `high`, conclude that the target isn’t in the list.
