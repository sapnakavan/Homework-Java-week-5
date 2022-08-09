package homework_java_week_5;
/*Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.*/

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Array_Colour {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Black");
        list.add("Orange");
        list.add("Yellow");

        for (String colour : list){
            System.out.println(colour);
        }
    }
}
