
package com.mycompany.lab03;
public class Employee {
    
    private int age;   
    private String name;
    private float salary;
    
   
    public Employee(String name, int age, float salary){
        this.age = age; 
        this.name = name;   
        this.salary = salary;
    }   
    
    public int getage(){
        return age;
    }   
    public void setage(int a){
        age = a;
    }
    
    
    public String getname(){
        return name;
    }
    
    
    public void setname(String n){
        name = n;
    }
    
    public float getsalary(){
        return salary;
    }
    public void setsalary(float s){
        salary = s;
    }
    
    public void test(){
        System.out.println("Emplyee name: "+ name);
        System.out.println("Employee age: "+ age);
        System.out.println("Employee salary: "+ salary);
    }
    
}

