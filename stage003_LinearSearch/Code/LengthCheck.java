
//Count the number of elements in an Array

public class LengthCheck {
    
    public static void main(String[] args) {
        int [ ] arry = {1,8,4,7,9,2,3,9};
        System.out.println(countElements(arry));//calling method
    }
    
    //method to count an number of elements present in an Array
    static int countElements(int[ ] array){
        int l = array.length;
        int count = 0;
        
        if(l == 0){
            return 0;
        }
        
        for(int i = 0; i<l; i++){
            count++;
        }
        return count;
    }
    
}

