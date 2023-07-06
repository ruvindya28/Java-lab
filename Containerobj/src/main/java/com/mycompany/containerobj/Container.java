
package com.mycompany.containerobj;

public abstract class Container {

    private double height;
    private double radius;

    public Container(double height,double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getheight() {
        return height;
    }

    public void setheight(double height) {
        this.height = height;
    }

    public double getradius() {
        return radius;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }
    public abstract double calculatevolume();
}


