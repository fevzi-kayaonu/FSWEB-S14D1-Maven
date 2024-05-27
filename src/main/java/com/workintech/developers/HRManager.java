package com.workintech.developers;

public class HRManager extends Employee{

    JuniorDeveloper[] juniorDeveloper = new JuniorDeveloper[]{new JuniorDeveloper(getId(), getName(), getSalary())};
    MidDeveloper[] midDeveloper = new MidDeveloper[]{new MidDeveloper(getId(), getName(), getSalary())};
    SeniorDeveloper[] seniorDeveloper = new SeniorDeveloper[]{new SeniorDeveloper(getId(), getName(), getSalary())};

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void work(){
        System.out.println("HRManager starts to working");
    }

    public void addEmployee(){

    }
}
