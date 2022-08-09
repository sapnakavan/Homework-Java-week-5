package homework_java_week_5;

import java.util.ArrayList;
import java.util.ListIterator;

/*Write a Java program to iterate through all elements in an array list using
        Iterator.*/
public class Iterator {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("I");
        a.add("am");
        a.add("a");
        a.add("Tester");
        a.add(".");

        ListIterator<String>listIterator = a.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
    }
}
