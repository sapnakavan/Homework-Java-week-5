package homework_java_week_5;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;
/* 10.Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.

 */
public class Particular_Station {
    public static void main(String[] args) {

        Map<String, String> zone = new HashMap<>();

        zone.put("Aldgate", "Metropolitan/Circle line/Hammersmith & City");
        zone.put("BakerStreet", "Metrolitan/Circle line/Central line/Hammersmith & City");
        zone.put("Euston square", "Metrolitan/Circle line/Hammersmith & City");
        zone.put("Great portland street", "Metropolitan/Circle line/Hammersmith & City");
        zone.put("Barbican", "Metropolitan/Circle line/Hammersmith & City");
        zone.put("Moorgate", "Metropolitan/Circle line/Hammersmith & City");
        zone.put("Liverpool street", "Metropolitan/Circle line/Hammersmith & City");
         String key = "Moorgate";
        System.out.println("At this station these trains will stop :");

        for (Map.Entry<String, String> station : zone.entrySet()) {
            //System.out.println(station.toString() + ", " + station.toString());
             if (station.getKey() == key){
                 System.out.println(station.getValue());
             }
        }
    }
}