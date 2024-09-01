
//Ceiling Number Find Question.
// Q: Find Smallest number greater or equal to target number.
//Ans: Ans will lie in start.

public class CeilingNumFind {
    
    public static void main(String[] args) {
        int [ ] arry = {2,4,7,9,10,12,24,27,28};//this is shorted array
        int target = 8;
        System.out.println(ceilingSearch(arry,target));//calling method
        
    }
    
    //Ceiling Num find method
    static int ceilingSearch(int [ ] array, int target){
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
        return start;//return the ceiling num
    }         
    }



