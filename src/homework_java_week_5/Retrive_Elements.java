package homework_java_week_5;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to retrieve an element (at a specified index) from a given
array list

 */
public class Retrive_Elements {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("sapna");
        a.add("kiana");
        a.add("kavan");
        a.add("pearl");
        a.add("Prisha");

        System.out.println(a);
        System.out.println();

        String e = a.get(2);
        System.out.println("retrive array element is : "+e);
        String e1 =a.get(4);
        System.out.println("retrive array element is : "+e1);
    }

}
