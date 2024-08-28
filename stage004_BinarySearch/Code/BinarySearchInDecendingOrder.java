
//Binary Search in Decending ordered Array

public class BinarySearchInDecendingOrder {
    
    public static void main(String[] args) {
        int [ ] arry = {100,22,10,9,7,4,2,1};//this is decending ordered shorted array
        int target = 22;
        System.out.println(binarySearch(arry,target));//calling method
        
    }
    
    //Optimized Binary Search in Decending Order
    static int binarySearch(int [ ] array, int target){
        int start = 0;
        int end = array.length -1;
        while (start <= end){
            int mid = start + (end - start) /2;
            
            //best case
            if(target == array[mid]){
                return mid;
            }
            
            //worst Cases
            else if(target < array[mid]){//for Right
                start = mid + 1;
            }
            else if(target > array[mid]){//for Left
                end = mid - 1;
            }
            else{
                return start;
            }
        }
        return -1;
    }         
    }

    