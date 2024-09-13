
//Bubble short Algrothm

public class BubbleSort {
    
    public static void main(String[] args) {
        int[] array = {2, 1, 9, 8};
        
        bubbleSort(array);
        
        // Print sorted array
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    
    // Function to do bubble sort
    static void bubbleSort(int[] array) {
        int n = array.length;
        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for each pass
            for (int j = 1; j < n - i; j++) {
                // Swap if the element is greater than the next one
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}


