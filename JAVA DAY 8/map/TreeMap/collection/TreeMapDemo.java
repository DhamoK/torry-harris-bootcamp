package map.TreeMap.collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer>demo=new TreeMap<>();

        demo.put("SUNDAY",1);
        demo.put("MONDAY",2);
        demo.put("TUESDAY",3);
        demo.put("WEDNESAY",4);
        demo.put("THURSDAY",5);
        demo.put("FRIDAY",6);
        demo.put("SATURDAY",7);

        System.out.println(demo);

    }

}
