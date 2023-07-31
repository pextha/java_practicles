
package com.mycompany.practicle5_q1;
public class Student extends Person{
    private String Course;
   
    public Student(String Name,int Id,String  Course)
    {
        super(Name,Id);
        this.Course=Course;
    }
    public String getCourse()
    {
        return Course;
    }
}
