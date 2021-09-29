package set.HashSet.Collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer>iobj=new HashSet<>();

        iobj.add(10);
        iobj.add(1);
        iobj.add(3);
        iobj.add(8);
        iobj.add(2);

        System.out.println(iobj);

        System.out.println();
        HashSet<Double>dobj=new HashSet<>();

        dobj.add(2.5);
        dobj.add(4.87);
        dobj.add(1.35);
        dobj.add(6.5);

        System.out.println(dobj);

        HashSet<String>sObj = new HashSet<>();

        sObj.add("RAM");
        sObj.add("NIVAS");
        sObj.add("KARTHIK");
        sObj.add("ARVINTH");
        sObj.add("VICKY");
        System.out.println();
        System.out.println(sObj);

    }
}
