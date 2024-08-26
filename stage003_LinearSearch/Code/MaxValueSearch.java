
//Searching a max value in an array

public class MaxValueSearch {
    
    public static void main(String[] args) {
        int [ ] arry = {9,2,8,2};
        System.out.println(minValueSearch(arry));
    }//calling method
    
    
    //method to search max value in an Array
    static int minValueSearch(int [ ] array){
        int max = array[0];
        int l = array.length;
        
        if (l == 0){
            return 0;
        }
        
        for(int i = 0; i<l; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        
        return max;
    }
    
}

