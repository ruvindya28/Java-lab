
package com.mycompany.employeeobj2;

public class Employee

  
{
    private String empName;
    private int empAge;
    private float empSalary;
    
    public Employee(String empName,int empAge,float empSalary){
        this.empName=empName;
         this.empAge=empAge;
         this.empSalary=empSalary;
        
    }
     public String getempName(){
        return empName;
    }
      
        public int getempAge(){
        return empAge;
    }
      
          public float getempSalary(){
        return empSalary;
    }
}
