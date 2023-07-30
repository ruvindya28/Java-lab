
package com.mycompany.itemobj;

public class Itemobj {

    public static void main(String[] args)
    {
        Item item = new Item(1, "A shiny sword");
        item.setLocation(10);
        item.setDescription("A powerful weapon");
     
        System.out.println("Item Location: " + item.getLocation());
        System.out.println("Item Description: " + item.getDescription());
        
    
        Monster monster = new Monster(5, "Giant spider");
        monster.setLocation(20);
        monster.setDescription("A scary creature");
        
        System.out.println("\nMonster Location: " + monster.getLocation());
        System.out.println("Monster Description: " + monster.getDescription());
    }
}

    

