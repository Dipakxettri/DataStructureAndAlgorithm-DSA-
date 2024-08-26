
//max value check

public class MaxValueCheckInArray {
    
    //method
    public static int max(int [] array){
        int maxv = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i] > maxv){
                maxv = array[i];
            }
            else{
                maxv = maxv;
            }
        }
        return maxv;
    }
    
    //main program
    public static void main(String[] args) {
        int [ ] arry = {2,2,9,8};
        System.out.println(max(arry));
    }
}


