
package com.mycompany.containerobj;

public class CylindricalContainer extends Container 
{
    public CylindricalContainer(double height,double radius) 
    {
        super(height,radius);
    }
    @Override
    public double calculatevolume() 
    {
        double calculatevolume = Math.PI * getradius() * getradius() * getheight();
        return calculatevolume;
    }
}

