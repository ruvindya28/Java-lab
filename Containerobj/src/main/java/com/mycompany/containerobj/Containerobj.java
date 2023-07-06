
package com.mycompany.containerobj;

public class Containerobj {

    public static void main(String[] args)
    {
         CylindricalContainer container = new CylindricalContainer(7, 5);
         
         double calculatevolume=container.calculatevolume();
         System.out.println("volume"+calculatevolume);
    }
}
