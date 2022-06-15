package JavaLearn.HashMapLearn;

import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {

        HashMap<String,Integer> mp = new HashMap<>();

        //insert
        mp.put("Lion",0);
        mp.put("Tiger",2);
        mp.put("Dog",3);

        // update
        mp.put("Lion",1);

        //delete
        mp.remove("Dog");

        // check
        System.out.println(mp.containsKey("Lion"));


        System.out.println(mp);

        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        // TreeMap is sorted ( asc ).
        //The TreeMap follows Red Black Tree based implementation.


    }
}
