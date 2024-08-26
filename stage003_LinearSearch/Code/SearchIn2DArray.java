
//Search Elements in an 2D Array

public class SearchIn2DArray {
    
    public static void main(String[] args) {
        int [ ] [] arry = {
            {1,2},
            {3,4}
        };
        int target = 2;
        
        System.out.println(searchElements(arry,target));//calling method
    }
    
    
    //method to search an elements in an 2D Array
    static boolean searchElements(int [ ] [ ] array, int target){
        int l = array.length;
        
        if(l == 0){
            return false;
        }
        
        for(int i = 0; i<l; i++){
            for(int j = 0; j<array[i].length; j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    
}
