
//2D Array Input Output

import java.util.Scanner;
public class 2DArrayInputOutput {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [ ][ ] arry1 = new int[4][];//here the size of row is require to define but not column
        
       int [ ] [ ] arry2 = {
           {1,2,3},
           {4,5},
           {6,7,8,9},
           {10}
       };//here the number of columns are differ from row to row
        
        //input:
        for(int i = 0; i<arry2.length; i++){//row
            for(int j = 0; j<arry2[i].length; j++){//column
                arry2[i][j] = sc.nextInt();
            }
        }
        
        //Output:
        for(int i = 0; i<arry2.length; i++){//row
            for(int j = 0; j<arry2[i].length; j++){//column
                System.out.print(arry2[i][j] +" ");
            }
            System.out.println("  ");
    }
    }
}


