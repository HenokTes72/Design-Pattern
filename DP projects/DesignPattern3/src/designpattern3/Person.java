/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern3;

import java.util.List;

/**
 *
 * @author User
 */
public abstract class Person {
    String name;
    double salary;
    
    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    
    public abstract void addAssistant(Person assistant);
    public abstract List<Person> getAssistants();
}
