package com.mycompany.shapemain;
public class Rectangle implements Shape 
{
    private int length;
    private int width;

    public Rectangle(int length, int width) 
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() 
    {
        double area = length * width;
        return area;
    }

    @Override
    public double calculatePerimeter() 
    {
        double perimeter = 2 * (length + width);
        return perimeter;
    }
}
