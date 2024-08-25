
//ArrayList Input Output code

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInputOutput {
    public static void ArrayListInputOutput(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>(4);//Array List 
        //Note : we can add as much as elements in ArrayList excluding the capacity we defined but , The capacity of an ArrayList is limited by the available memory of the Java Virtual Machine (JVM)

        // Input
        for(int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        // Output
        System.out.println("The elements in the list are  :");
        for(int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}


