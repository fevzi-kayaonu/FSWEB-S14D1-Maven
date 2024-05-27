package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    public void work(){
        System.out.println("SeniorDeveloper starts to working");
        setSalary(100);
    }

}
