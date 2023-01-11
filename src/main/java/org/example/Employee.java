package org.example;

public class Employee {
    private int ID  ;
    private String Name;
    private double Salary;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return Salary;
    }
    public String toString()
    {
        return getID()+" "+getName()+getID()+" "+getSalary();
    }
}
