

package com.mycompany.lab03;
public class Lab03 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Pathum Theekshana",22,100000.00f);
        System.out.println("Emplyee name: "+ e1.getname());
        System.out.println("Employee age: "+ e1.getage());
        System.out.println("Employee salary: "+ e1.getsalary());  
    }
}
