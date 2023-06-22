package com.mycompany.shapemain;
public class Shapemain 
{

    public static void main(String[] args) 
    {
        Circle circle=new Circle(5);
        Rectangle rectangle=new Rectangle(5,10);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        
        System.out.println("Circle Area :"+circle.calculateArea());
        System.out.println("Circle Area :"+circle.calculatePerimeter());
        
        
       System.out.println("Rectangle Area :"+rectangle.calculateArea());
       System.out.println("Rectangle Perimeter :"+rectangle.calculatePerimeter());
       
       System.out.println("Triangle Area :"+triangle.calculateArea());
       System.out.println("Triangle Perimeter :"+triangle.calculatePerimeter());
        
        
        
    }
}
