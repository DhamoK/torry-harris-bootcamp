package com.torryharris.drive;

import com.torryharris.model.A;
import com.torryharris.model.B;

public class ABDemo {
    public static void main(String[] args) {
        System.out.println(A.value+" "+B.value);
        A aObj = new A();
        //   aObj.display();
        aObj.staticMethod();
        A.value=100;

        System.out.println(A.value+" "+B.value);

        B bObj = new B();
        //bObj.display();
        // bObj.anotherMethod();
        bObj.staticMethod();
        B.value=200;
        System.out.println(A.value+" "+B.value);
        A x = new B();
        //   x.display();
        x.staticMethod();       // Calling static method from parent reference
        // calls the parent method, as its early binding


        A.value=300;
        System.out.println(A.value+" "+B.value);

        //  x.anotherMethod();



       /* A aObj = new A(10);
        System.out.println("A class obj-> value of a is:"+aObj.getA());*/

       /* B bObj= new B(20,30);
        System.out.println("B class obj -> value of a is:"+bObj.getA());
        System.out.println("B class obj -> value of b is:"+bObj.getB());
        B anotherBObj = new B(100);
        anotherBObj.setSuperClassA();
        System.out.println("B class anotherBObj -> value of a is:"+anotherBObj.getA());
        System.out.println("B class anotherBObj -> value of b is:"+anotherBObj.getB());*/
    }
}
