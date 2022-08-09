package homework_java_week_5;

import java.util.HashMap;

/*/9. Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map

 */
public class HashMapObject {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Kavan", 2);
        people.put("Sapna",4);
        people.put("Kiana",7);
        people.put("Sandeep",6);

        for (String i : people.keySet()){
            System.out.println("Key :"+ i + " Value: "+ people.get(i));
        }


    }
}
