

package com.mycompany.practicle5_q1;
public class Practicle5_Q1 {

    public static void main(String[] args) {
       
        Student s1=new Student("pathum",28524,"software Engineering");
        Lecturer l1=new Lecturer("Mr.Pasan",20303,"Software Egineering");
        
        System.out.println("student details\n"+s1.getName()+"\t"+s1.getID()+"\t"+s1.getCourse()+"\n");
        System.out.println("Lecturer details\n"+l1.getName()+"\t"+l1.getID()+"\t"+l1.getProgramme());
    }
}
