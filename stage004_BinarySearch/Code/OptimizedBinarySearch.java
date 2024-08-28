
// Optimized Binary Search  for assending ordered Array

public class OptimizedBinarySearch {
    
    public static void main(String[] args) {
        int [ ] arry = {2,8,9,10,12,19,22,29};//this is shorted array
        int target = 9;
        System.out.println(binarySearch(arry,target));//calling method
        
    }
    
    //Optimized Binary Search 
    static int binarySearch(int [ ] array, int target){
        int start = 0;
        int end = array.length -1;
        while (start <= end){
            int mid = start + (end - start) /2;
            
            if(target > array[mid]){//for right
                start = mid + 1;
            }
            else if(target<array[mid]){//for left
                end = mid - 1;
            }
            else{
                return start;
            }
        }
        return -1;
    }         
    }

