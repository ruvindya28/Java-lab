
package com.mycompany.employeeobj2;

public class Employeeobj2 {

    public static void main(String[] args) 
    {
          Employee e1=new Employee("sachini",22,3000000.00f);
        
          
        System.out.println("Employee name is: "+e1.getempName());
        System.out.println("Employee age is: "+e1.getempAge());
        System.out.println("Employee salary is: "+e1.getempSalary());
       
    }
}
