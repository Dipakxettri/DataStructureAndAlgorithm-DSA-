
//Order Agnostic Binary Search 

public class OrderAgnosticBinarySearch {
    
    public static void main(String[] args) {
        
        int [ ] arry = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        System.out.println(orderAgnosticBinarySearch(arry,target));
        
    }
    
    static int orderAgnosticBinarySearch(int [ ] array, int target){
        int start = 0; 
        int end = array.length - 1;
        boolean isAssending = false;
        
        while(start<=end){
            
            int  mid = start +(end - start)/2;
            
            //Checking for Assending or Decending
            if(array[start] < array[end]){
                isAssending = true;
            }
            else{
                isAssending = false;
            }
            
            //Best Case
            if(target == array[mid]){
                return mid;
            }
            
            //Worst cases
            //for Assending
            else if(isAssending){
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
            
            //for decending
            else{
                if(target < array[mid]){//for right
                start = mid + 1;
            }
            else if(target > array[mid]){//for left
                end = mid - 1;
            }
            else{
                return start;
            }
            }
        }
        return -1;
    }
    
}


