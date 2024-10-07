package tmsl.shirsak;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMap {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1,"House");
        integerStringMap.put(2,"Garden");
        integerStringMap.put(3,"Furniture");

        System.out.println(integerStringMap);

        for (Map.Entry<Integer,String> map : integerStringMap.entrySet()){
            System.out.println("Key = "+map.getKey() + " Values = "+map.getValue());
        }

        for (Integer key : integerStringMap.keySet()){
            System.out.println(key);
        }

        for (Integer key : integerStringMap.keySet()){
            System.out.println(integerStringMap.get(key));
        }

    }
}
