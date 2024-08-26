
//Search char in strings 

public class CharSearch {
    
    public static void main(String[] args) {
        String string = "Deepak";
        char target = 'k';
        System.out.println(charSearch(string,target));//calling method1
        System.out.println(charSearch2(string,target));//calling method 2
    }
    
    //Search 1 : using for Loop
    static boolean charSearch(String string, char target){
        int l = string.length();
        
        if(l == 0){
            return false;
        }
        
        for(int i = 0; i<l; i++){
            if(target == string.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
    //Search 2 : usingfor Each Loop by converting string into array
    static boolean charSearch2(String string, char target){
        int l = string.length();
        
        if(l == 0){
            return false;
        }
        
        for(char charr:string.toCharArray()){// converting string into an Array 
            if(charr == target){
                return true;
            }
        }
        return false;
    }
    
}


