package set.LinkedHashSet.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer>iObj=new LinkedHashSet<>();

        iObj.add(5);
        iObj.add(6);
        iObj.add(10);

        System.out.println(iObj);

        LinkedHashSet<String>sObj=new LinkedHashSet<>();

        sObj.add("RAM");
        sObj.add("NAVEEN");
        sObj.add("RAJ");

        System.out.println(sObj);
    }
}
