
//1D Array Input Output
  
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       int [ ] arry = new int[4];//Arry object of size 4 the defult value is 0
        
        //input:
        for(int i = 0; i<arry.length; i++){
            arry[i] = sc.nextInt();
        }
        
        //Output:
        for(int j = 0; j<arry.length; j++){
        System.out.print(arry[j] + " ");
    }
    }
}

