
//My Own Binary Search Logic 

public class OwnBinarySearchLogic {
    
    public static void main(String[] args) {
        int [ ] arry = {2,8,9,10,12,19,22,29};//this is shorted array
        int target = 22;
        System.out.println(binarySearch(arry,target));
        
    }
    
    
    static boolean binarySearch(int [ ] array, int target){
        int start = (0 + array.length)/2;
        int end = array.length;
        boolean isFound = false;
        
        if (array[start] == target){
            isFound = true;
        }
        else if(array[start]<target){
            for(int i = start; i<end; i++){
                if(array[i] == target){
                    isFound = true;
                }
            }
        System.out.println(start + " " + end);
        }
        else if(array[start]>target){
            end = start;
            start = 0;
            
            for(int i = 0; i<end; i++){
                if(array[i] == target){
                    isFound = true;
                }
            }
        System.out.println(start + " " +end);
        }
        return isFound;
    }
    
}