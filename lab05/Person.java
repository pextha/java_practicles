
package com.mycompany.practicle5_q1;
public class Person {
    private String Name;
    private int Id;
    
    public Person(String Name,int Id)
    {
        this.Name=Name;
        this.Id=Id;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getID() {
        return Id;
    }

    public void setID(int Id) {
        this.Id = Id;
    }
}
