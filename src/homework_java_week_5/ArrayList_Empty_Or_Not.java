package homework_java_week_5;

import java.util.ArrayList;

/*Write a Java program to test an array list is empty or not. Define array list with
underground tube names

 */
public class ArrayList_Empty_Or_Not {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Jubile");
        l.add("Metrolitan");
        l.add("northen");
        l.add("Piccadily");
        System.out.println("First array list :  "+ l);
        System.out.println("checking the above list is empty or not! "+ l.isEmpty());
        l.removeAll(l);
        System.out.println("Array list after remove all elements "+l);
        System.out.println("checking the above array list is empty or not! "+l.isEmpty());
    }

}
