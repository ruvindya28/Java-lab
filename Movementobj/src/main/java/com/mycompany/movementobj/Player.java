
package com.mycompany.movementobj;


public class Player extends Movement {
    
    @Override
    public void moveUp() 
    {
        System.out.println("Player moved up");
    }
    
    @Override
    public void moveDown() 
    {
        System.out.println("Player moved down");
    }
 
    @Override
    public void moveLeft() {
        System.out.println("Player moved left");
    }
    
     @Override
    public void moveRight() {
        System.out.println("Player moved right");
    } 
}
