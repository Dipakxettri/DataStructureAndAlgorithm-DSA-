
//Search in Range

public class SearchInRange {
    
    public static void main(String[] args) {
        int [ ] arry = {1,2,3,4};
        int target = 4;
        System.out.println(searchInRange(arry,target,0,3));//calling method
    }
    
    //method to search in range
    static boolean searchInRange(int [ ] array,int target,int start,int end){
        int l = array.length;
        if(l == 0){
            return false;
        }
        for(int i = start;i<=end; i++){
            if(array[i] == target){
                return true;
            }
        }
        return false;
    }
}


