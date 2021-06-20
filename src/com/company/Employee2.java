package com.company;

public class Employee2 {
    public static void main (String [] args){
        Employee3 p1= new Employee3 ("Ivan", 1000,20,50);
p1.setName("Petro");
        System.out.println (p1);


    }
}
class Employee3 {
private String name;
private int salary;
private int bonuses;
private int rate;
public Employee3(String name,int salary,int rate,int bonuses)
        {
            this. name=name;
            this.salary=salary;
            this.rate=rate;
            this.bonuses= bonuses;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonuses() {
        return bonuses;
    }

    public void setBonuses(int bonuses) {
        this.bonuses = bonuses;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", bonuses=" + bonuses +
                ", rate=" + rate +
                '}';
    }
}