
package com.mycompany.testinheritance;

public class TestInheritance {

    public static void main(String[] args) 
    {
        B b = new B();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
        C c = new C();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() ); }

    }
//OUTPUT
       //9
       //6

//this code demonstrates the concept of inheritance, method overriding, and method extension in Java
