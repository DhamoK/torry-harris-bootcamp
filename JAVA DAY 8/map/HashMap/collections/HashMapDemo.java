package map.HashMap.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>sObj=new HashMap<>();

        sObj.put(100,"KAMALESH");
        sObj.put(101,"DHAMO");
        sObj.put(102,"SURYA");

        System.out.println();
        System.out.println(sObj);
        System.out.println();

        for(Integer Key:sObj.keySet()){
            System.out.println(Key +" = "+sObj.get(Key));
        }
        for(Map.Entry<Integer,String> entry:sObj.entrySet()){
            System.out.println(entry);
            System.out.println("Key:"+ entry.getKey() + " Value:"+ entry.getValue());
        }
    }
}
