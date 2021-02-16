package concept.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvanceMap {
    public static void main(String[] args) {

        List<String> statesOfUSA = new ArrayList<>();
        statesOfUSA.add("NY");
        statesOfUSA.add("NJ");
        statesOfUSA.add("CA");
        statesOfUSA.add("PA");
        statesOfUSA.add("TX");
        statesOfUSA.add("VA");


        Map<String , List<String>> stn = new HashMap<>();
        stn.put("USstates", statesOfUSA);

        for(Map.Entry<String , List<String>> ust : stn.entrySet()){
            System.out.println(ust.getKey()+" : "+ust.getValue());
        }





    }
}
