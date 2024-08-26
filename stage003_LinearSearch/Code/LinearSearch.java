
//Linear Search Algorithm 

public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int target = 2;
        
        System.out.println(linearSearch(array, target));
    }

    static int linearSearch(int[] array, int target) {
        if(array.length == 0){
            return -1;
        }
        for (int index = 0; index < array.length; index++) {
            if (array[index] == target) {
                return index;
            }
        }
        return -1;
    }
}

