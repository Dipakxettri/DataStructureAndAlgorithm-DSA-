
//Selection Sort

import java.util.Arrays;//array import
public class SelectionSort {
    
    public static void main(String[] args) {
        
        int [ ] arry = {9,4,7,1,2,10,8};
        selectionSort(arry);
        System.out.println(Arrays.toString(arry));// Print the sorted array
    }
    
    // Method for Selection Sort
    static void selectionSort(int [ ] array){
        for(int i = 0; i<array.length; i++){
            int last = array.length - i -1;
            int maxIndex = maxIndex(array,0,last);//Get index of max element
            swap(array, maxIndex, last);  // Swap the max element with the last element
        }
    }
    
        // Method to get the index of the maximum element in the given range
    static int maxIndex(int [] array, int start, int end){
        int max = start;// Start with the first element as the max
        for (int i = start; i <= end; i++){
            if (array[max] < array[i]){
                max = i;// Update max index when a larger value is found
            }
        }
        return max;
    }
    
        // Method to swap two elements in the array
    static void swap(int array[], int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
    {
        
    }
}
