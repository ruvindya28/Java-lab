
package com.mycompany.arrayexception;

public class ArrayException {

          public static void main(String[] args) 
    {
     int [] numbers={1,2,3,4,5};
    
     try
     
     {
         int value=numbers[10];
         System.out.println("Value: "+value);
     }
     catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Error: Array index is out of ");
     }
     catch(java.lang.Exception e){
         System.out.println(e.getMessage());
     }
     finally{
         for(int i=0;i<numbers.length;i++)
         {
             System.out.println(""+numbers[i]);
         }
     }
   }
}

