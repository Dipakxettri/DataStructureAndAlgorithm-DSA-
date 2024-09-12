
// 2D Array Binary Search  for assending ordered Array in both row wise and column wise Sorted

import java.util.Arrays;

public class MatrixBinarySearch {

    public static void main(String[] args) {
        int[][] array = {
            {2, 8, 9},
            {4, 9, 10},
            {8, 12, 19}
        };
        int target = 10;
        System.out.println(Arrays.toString(binarySearch(array, target)));
    }

    static int[] binarySearch(int[][] array, int target) {
        int row = 0;
        int col = array[0].length - 1;

        // Start from the top-right corner of the array
        while (row < array.length && col >= 0) {
            if (array[row][col] == target) {
                return new int[]{row, col};  // Target found
            } else if (array[row][col] > target) {
                col--;  // Move left in the current row
            } else {
                row++;  // Move down to the next row
            }
        }
        return new int[]{-1, -1};  // Target not found
    }
}