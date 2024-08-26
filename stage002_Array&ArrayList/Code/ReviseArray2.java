
//Array Revise with another algo

public class ReviseArray2 {
    
    //Methods
    public static void swap(int[] array, int start, int end){
        int l = array.length;
        int n = l/2;
        for(int i = start; i<2; i++){
            array[start] = array[end];
            array[end] = array[start];
            start++;
            end--;
            
        }
    }
    
    public static void outputArray(int [ ] array2){
        for(int i = 0; i<array2.length; i++){
            System.out.print(array2[i] + " ");
        }
    }
     
    
    public static void main(String[] args) {
        int [ ] arry = {1,2,3,4,5,6,7,8,9,10};
        swap(arry,0,9);
        outputArray(arry);
    }
}

