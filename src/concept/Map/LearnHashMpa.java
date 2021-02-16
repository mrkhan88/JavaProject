package concept.Map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMpa {

    public static void main(String[] args) {

        Map<Integer, String> stInfo = new HashMap<>();
        stInfo.put(101, "Mamun Khan");
        stInfo.put(102, "Hasnath Ali");
        stInfo.put(103, "Ashraf Khandaker");
        stInfo.put(104, "Shamsul Islam");
        stInfo.put(105, "Kamrul Hasan");

        //System.out.println(stInfo.get(101));

       for(Map.Entry<Integer, String > sti : stInfo.entrySet() ){
           System.out.println(sti.getKey()+" : "+sti.getValue());
       }

        System.out.println("**************************************");
        System.out.println("ALternative approach>>>");

        for(Integer sinfo : stInfo.keySet()){
            System.out.println(sinfo+" : "+stInfo.get(sinfo));
        }


        System.out.println("******************************************");



        Map<String, String> states = new HashMap<>();
        states.put("Bangladesh", "Dhaka");
        states.put("USA", "New York");
        states.put("Canada", "Otowa");
        states.put("Argentina", "Buenos Aires");
        states.put("Sweden", "Stockholm");

        for(Map.Entry<String, String> sta : states.entrySet()){
            System.out.println(sta.getKey()+" : "+sta.getValue());
        }

        System.out.println("ALternative approach.........");

        for(String stat : states.keySet()){
            System.out.println(stat+" | "+states.get(stat));
        }








    }



}
