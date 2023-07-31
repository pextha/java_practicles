
//test class = Practical_4_Q1
package com.mycompany.practical_4_q1;
public class Practical_4_Q1 {

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setID(1001);
        e1.setName("Mr.Bogdan");
        e1.setDesignation("Manager");
        
        Employee e2=new Employee();
        e2.setID(1002);
        e2.setName("Ms.Bird");
        e2.setDesignation("Accountant");
        
        System.out.println("employee one \n"+e1.getID()+"\t"+e1.getName()+"\t"+e1.getDesignation());
        System.out.println("employee two \n"+e2.getID()+"\t"+e2.getName()+"\t"+e2.getDesignation());
    }
}
