
package com.mycompany.loopexample;

public class LoopExample {

    public static void main(String[] args) 
    {
       int[]numbers={10,20,30,40,50};
       for(int x:numbers){
           if(x==30){
               break;
           }
           System.out.println(x);
           System.out.println("\n");
       }
        System.out.println("I'm out of the loop now");


    }
}

//output

//10
//20
//I'm out of the loop now
