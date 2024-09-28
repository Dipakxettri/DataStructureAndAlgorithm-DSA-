
//Insertion Sort Algrothm

public class InsertionSort{
    
    public static void main(String[] args) {
        int [ ] arry = {2,1,8,5,6,7,4,3};
        insertionSort(arry);
    }
    
    static void insertionSort(int [ ] array){
        int l = array.length;
        for(int i = 0; i<l-2; i++){
            for(int j = i+1; j>0; j--){
                if(array[j] < array[j-1]){
                    swap(array,j,j-1);
                }
                else{
                    break;
                }
            }
        }
        
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    static void swap(int array[], int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
    
    
            }
