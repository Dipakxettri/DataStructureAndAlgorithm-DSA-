//max value check in Range 

public class  MaxValueCheckInRange{
    
    //method
    public static int max(int [] array , int start, int end){
        int maxv = array[start];
        for(int i = start; i<=end; i++){
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
        int [ ] arry = {2,4,7,9};
        System.out.println(max(arry , 0,1));
    }
        
}