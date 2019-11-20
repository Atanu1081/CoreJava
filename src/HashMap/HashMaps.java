package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {

    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Australia", "Sydney");
        capitalCities.put("India", "Delhi");



        //System.out.println(capitalCities.get("Australia"));

        capitalCities.put("Australia", "Canberra");
        //System.out.println(capitalCities.get("Australia"));
        capitalCities.putIfAbsent("Australia", "gfvhg");
        //System.out.println(capitalCities.get("Australia"));

        //System.out.println(capitalCities.get("Australia"));

        //System.out.println(capitalCities);
        //System.out.println(capitalCities.get("Australia"));

        /*for (String capital : capitalCities.keySet())
        {
            System.out.print(capital + " ");
        }*/

        /*System.out.println();

        for (String capital : capitalCities.values())
        {
            System.out.print(capital + " ");
        }

        System.out.println();*/

        /*for (String capital : capitalCities.keySet())
        {
            System.out.println("Key is : " + capital + " and value is : " + capitalCities.get(capital));
        }*/

        Set<Map.Entry<String,String>> entrySet = capitalCities.entrySet();

        for (Map.Entry<String,String> entry : entrySet)
        {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

    }
}
