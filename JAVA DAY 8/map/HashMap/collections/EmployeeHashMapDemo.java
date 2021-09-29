package map.HashMap.collections;

import map.HashMap.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, Object> Eobj = new HashMap<>();
        Employee e1 = new Employee(101, "RAVI", "DBA", "GOA");
        Employee e2 = new Employee(106, "KARTHI", "QA", "PUNE");
        Employee e3 = new Employee(102, "BALA", "LEAD", "MADURAI");
        Employee e4 = new Employee(101, "RAVI", "DBA", "GOA");

        System.out.println(e1.hashCode());
        System.out.println(e4.hashCode());

        Eobj.put(e1.getEmpId(), e1);
        Eobj.put(e2.getEmpId(), e2);
        Eobj.put(e3.getEmpId(), e3);

        for (Map.Entry<Integer, Object> entry : Eobj.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());

        }
        System.out.println();

        HashMap<Object, Integer> iobj = new HashMap<>();
        Employee i1 = new Employee(101, "RAVI", "DBA", "GOA");
        Employee i2 = new Employee(106, "KARTHI", "QA", "PUNE");
        Employee i3 = new Employee(102, "BALA", "LEAD", "MADURAI");

        iobj.put(i1,i1.getEmpId());
        iobj.put(i2,i2.getEmpId());
        iobj.put(i3,i3.getEmpId());

        for (Map.Entry<Object,Integer> entry : iobj.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        }

    }
}
