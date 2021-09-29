package collectiontask.collection;

import collectiontask.model.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ArrayListDemo {
    public static void main(String[] args) {

        Car c1 = new Car(2345,"SWIFT","E-VEHICLE",30.2f);
        Car c2 = new Car(2347,"NEXON","DIESEL",32.24f);
        Car c3 = new Car(2349,"NEXON","PETROL",40.2f);
        Car c4 = new Car(2342,"LAMBOGINI","PETROL",32.2f);
        Car c5 = new Car(2341,"ROLLS ROYCE","E-VEHICLE",45.2f);

        ArrayList<Car>cars=new ArrayList<>();

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);

        for(Car c:cars){
            System.out.println(c);
        }

        System.out.println("==============================================");

        TreeMap<Float,Object>c=new TreeMap<>();

        c.put(c1.getPower(),c1);
        c.put(c2.getPower(),c2);
        c.put(c3.getPower(),c3);
        c.put(c4.getPower(),c4);
        c.put(c5.getPower(),c5);

        for(Map.Entry<Float,Object> entry:c.entrySet()) {
            System.out.println("Value:" + entry.getValue());
        }

            System.out.println("==============================================");

            HashMap<String,Object>car = new HashMap<>();

            car.put(c1.getCarName(),c1);
            car.put(c2.getCarName(),c2);
            car.put(c3.getCarName(),c3);
            car.put(c4.getCarName(),c4);
            car.put(c5.getCarName(),c5);

        for(Map.Entry<String,Object> e:car.entrySet()){
            System.out.println("Key:"+ e.getKey() +"    "+" Value:"+ e.getValue());
        }
    }
}
