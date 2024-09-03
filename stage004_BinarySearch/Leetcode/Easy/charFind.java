
//Q). Find Smallest Letter Greater Than Target letter.
//Note : ignore equal
// Ans : return letters[start % letters.length]

public class charFind {
    
    public static void main(String[] args) {
        char [ ] letters = {'c','f','j'};//this is increasing letters
        char target = 'd';
        System.out.println(charFind(letters,target));//calling method
        
    }
    
    //char Find
    static char charFind(char [ ] letter, char target){
        int start = 0;
        int end = letter.length -1;
        while (start <= end){
            int mid = start + (end - start) /2;
            
            if(target > letter[mid]){//for right
                start = mid + 1;
            }
            else{//for left
                end = mid - 1;
            }
        }
        return letter[start % letter.length]; //return the floor num
    }         
    }
