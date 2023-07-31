
package com.mycompany.practicle5_q1;
public class Lecturer extends Person{
    private String Programme;
    
    public Lecturer(String Name,int Id,String Programme)
    {
        super(Name,Id);
        this.Programme=Programme;
    }
    public  String getProgramme()
    {
        return Programme;
    }
    
    
}
