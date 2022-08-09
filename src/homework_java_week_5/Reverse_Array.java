package homework_java_week_5;
//3. Write a Java program to reverse an array of integer values.

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] a = new int[] {10,45,15,48,25,30,8,5};

        System.out.println("Actual Array  : ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + ", ");
        }
        System.out.println( );
        System.out.println("Reverse Array : ");
        for (int i=a.length-1;i>=0;i--){
            System.out.print(a[i] + " ,");
        }

    }
}
