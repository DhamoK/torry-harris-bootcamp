package set.TreeSet.collections;

import set.TreeSet.comparator.PersonCityComparator;
import set.TreeSet.comparator.PersonNameComparator;
import set.TreeSet.model.Person;

import java.util.TreeSet;

public class PersonTreeSetDemo {
    public static void main(String[] args) {
        Person p1 = new Person(10024,"DECAPRIO","ACTOR","LONDON");
        Person p2 = new Person(10026,"MURPHY","SE","BIRMINGHAM");
        Person p3 = new Person(10021,"NOLAN","DIRECTOR","NEW JERSEY");
        Person p4 = new Person(10029,"STEVE ROGERS","SOLDIER","SPAIN");

        System.out.println();
        System.out.println("=================SORT BY PERSONID=====================");
        System.out.println();
        TreeSet<Person>people = new TreeSet<>();

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        for(Person person:people){
            System.out.println(person);
        }
        System.out.println();
        System.out.println("===============SORTING BY NAME==================");
        System.out.println();
        TreeSet<Person>sortByName = new TreeSet<>(new PersonNameComparator());

        sortByName.add(p1);
        sortByName.add(p2);
        sortByName.add(p3);
        sortByName.add(p4);

        for(Person person:sortByName){
            System.out.println(person);
        }
        System.out.println();
        System.out.println("===============SORTING BY City==================");
        System.out.println();
        TreeSet<Person>sortByCity = new TreeSet<>(new PersonCityComparator());

        sortByCity.add(p1);
        sortByCity.add(p2);
        sortByCity.add(p3);
        sortByCity.add(p4);
        sortByCity.remove(p2);

        for(Person person:sortByCity){
            System.out.println(person);
        }
    }
}
