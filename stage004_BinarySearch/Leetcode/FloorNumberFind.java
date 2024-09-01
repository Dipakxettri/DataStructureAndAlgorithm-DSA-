
//Floor Number Find Question
//Q: Find Greatest number small or equal to target number.
//Ans: Ans will lie in end.

public class FloorNumberFind {
    
    public static void main(String[] args) {
        int [ ] arry = {2,4,7,8,9,12,19,20,22,44};//this is shorted array
        int target = 28;
        System.out.println(floorSearch(arry,target));//calling method
        
    }
    
    //Floor Num find method
    static int floorSearch(int [ ] array, int target){
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
        return end;//return the floor num
    }         
    }



