
package com.mycompany.employeeobj3;

public class Employeeobj3 {

    public static void main(String[] args) 
    {
        Employee Bogdan = new Employee();
        Employee Bird = new Employee();

       
        Bogdan.setEmpID(101);
        Bogdan.setEmpName("Mr. Bogdan");
        Bogdan.setEmpDesignation("Software Engineer");

        Bird.setEmpID(102);
        Bird.setEmpName("Ms. Bird");
        Bird.setEmpDesignation("Data Scientist");

      
        System.out.println("Employee ID: " + Bogdan.getEmpID());
        System.out.println("Employee Name: " + Bogdan.getEmpName());
        System.out.println("Employee Designation: " + Bogdan.getEmpDesignation());

        System.out.println();

        System.out.println("Employee ID: " + Bird.getEmpID());
        System.out.println("Employee Name: " + Bird.getEmpName());
        System.out.println("Employee Designation: " + Bird.getEmpDesignation());
    }
}

    

