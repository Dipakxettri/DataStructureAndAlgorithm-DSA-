
//Array Revise

public class RevisedArray{
    
    //Methods
    public static void arrayRevise(int[] array){
        int l = array.length;
         int n = l/2;
        int temp;
        for(int i = 0; i<n; i++){
            temp = array[i];
            array[i] = array[l-i-1];
            array[l-i-1] = temp;
        }
    }
    
    public static void outputArray(int [ ] array2){
        for(int i = 0; i<array2.length; i++){
            System.out.print(array2[i] + " ");
        }
    }
     
    
    public static void main(String[] args) {
        int [ ] arry = {1,2,3,4,5,6,7,8,9,10};
        arrayRevise(arry);
        outputArray(arry);
    }
}

