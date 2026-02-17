import java.util.*;
public class Hashmap{
    public static void main(String[] args){
        Map<String, Integer> map=new HashMap<>();
        map.put("nikki",0);
        map.put("nanda",1);
        map.put("dad",2);
        map.put("mom",3);
        System.out.println("total hashMap"+map);
        for(String key:map.keySet())
        {
            System.out.println(key);
        }
        for(Integer value:map.values())
        {
            System.out.println(value);
        }
    }
}