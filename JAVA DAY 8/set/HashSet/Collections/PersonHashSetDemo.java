package set.HashSet.Collections;

import set.TreeSet.model.Person;

import java.util.HashSet;

public class PersonHashSetDemo {
    public static void main(String[] args) {
        Person p1 = new Person(10024, "DECAPRIO", "ACTOR", "LONDON");
        Person p2 = new Person(10026, "MURPHY", "SE", "BIRMINGHAM");
        Person p3 = new Person(10021, "NOLAN", "DIRECTOR", "NEW JERSEY");
        Person p4 = new Person(10029, "STEVE ROGERS", "SOLDIER", "SPAIN");

        System.out.println(p1.hashCode());

        HashSet<Person>personHashSet=new HashSet<>();

        personHashSet.add(p1);
        personHashSet.add(p2);
        personHashSet.add(p3);
        personHashSet.add(p4);

        for(Person p:personHashSet){
            System.out.println(p);
        }

    }
}
