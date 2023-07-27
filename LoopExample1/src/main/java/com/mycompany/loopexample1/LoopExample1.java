
package com.mycompany.loopexample1;

public class LoopExample1 {

    public static void main(String[] args)
    {
      int[]numbers={10,20,30,40,50};
       for(int x:numbers){
           if(x==30){
               continue;
           }
           System.out.println(x);
           System.out.println("\n");
       }
        System.out.print("I'm out of the loop now");
}
}

//output

//10
//20
//40
//50
//I'm out of the loop now
