package set.TreeSet.collections;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> Sobj = new TreeSet();
        Sobj.add("ZACK");
        Sobj.add("MICHAEL");
        Sobj.add("ADAM");
        Sobj.add("LUCIFER");
        Sobj.add("AMANADIEL");
        System.out.println(Sobj);
        System.out.println();
        System.out.println("==============REVERSE ORDER====================");
        TreeSet<String> Tobj = new TreeSet(Collections.reverseOrder());
        Tobj.add("ZACK");
        Tobj.add("MICHAEL");
        Tobj.add("ADAM");
        Tobj.add("LUCIFER");
        Tobj.add("AMANADIEL");
        System.out.println(Tobj);
    }

}
