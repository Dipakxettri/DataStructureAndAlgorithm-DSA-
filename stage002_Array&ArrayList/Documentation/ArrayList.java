
//ArrayList

import java.util.ArrayList;

public class ArrayList {
    
    public static void main(String[] args) {
        
        //ArrayListObjects
        ArrayList<Integer> arry = new ArrayList<>(4);//this is a arry list
        
        //Adding a vales in ArrayList 
        //Note : we can add as much as elements in ArrayList excluding the capacity we defined but , The capacity of an ArrayList is limited by the available memory of the Java Virtual Machine (JVM)
        
        arry.add(20);
        arry.add(40);
        arry.add(70);
        arry.add(220);
        
        //printing ArrayList
        System.out.println(arry);
        
    }
    
}

