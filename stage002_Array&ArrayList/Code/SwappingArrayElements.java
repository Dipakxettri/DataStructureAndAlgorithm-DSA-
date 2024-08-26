
//Swapping an elements of an array

public class SwappingArrayElements {
    static void swap(int[] arry, int index1, int index2){
            int temp =arry[index1];
            arry[index1] = arry[index2];
            arry[index2] = temp;
        }
    public static void main(String[] args) {
        
        int [] arry = {1,2,3,4};
        swap(arry,0,1);
        
        for(int i = 0;i <arry.length; i++){
            System.out.print(arry[i] + " ");
        }
        
        
    }
    
}