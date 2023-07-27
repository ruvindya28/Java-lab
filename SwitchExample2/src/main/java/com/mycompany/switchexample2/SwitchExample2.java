
package com.mycompany.switchexample2;

public class SwitchExample2 {

    public static void main(String[] args) 
    {
       
       char grade ='A';
	if(grade=='A')
        {
	System.out.println("Excellent!");
        }        
        if(grade=='D')
        {
	System.out.println("You passed");
        }
	  if(grade=='F')
          {
	System.out.println("Better try again");
          }
        else
	System.out.println("Invalid grade");
	}
    }

//Excellent!
//Invalid grade
