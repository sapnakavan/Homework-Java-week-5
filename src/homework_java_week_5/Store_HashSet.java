package homework_java_week_5;

import java.util.HashSet;

/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)
 */
public class Store_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();//Create a hashset object called numbers

        numbers.add(7);/*add value to the set*/
        numbers.add(8);
        numbers.add(5);
            //show which numbers between 1 to 10 are in the set
        for (int i = 1;i<=10; i++){
            if(numbers.contains(i)){
                System.out.println(i +" was found in the set .");
            }else {
                System.out.println(i +" was not found in the set.");
            }
        }
    }
}
