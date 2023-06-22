
package com.mycompany.shapemain;
public class Circle implements Shape 
{
    private int radius;

    public Circle(int radius) 
    {
        this.radius = radius;
    }

    @Override
    
    public double calculateArea() 
    {
        double Area = (Math.PI * radius * radius);
        return Area;
    }
       @Override
    
    public double calculatePerimeter() 
    {
       double perimeter = (float) (2 * Math.PI * radius);
        return perimeter;
    }
}


