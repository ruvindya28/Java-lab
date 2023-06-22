package com.mycompany.shapemain;
public class Triangle implements Shape 
{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) 
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() 
    {
        double semiPerimeter = (sideA + sideB + sideC) / 2.0;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        return area;
    }

    @Override
    public double calculatePerimeter() 
    {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }
}