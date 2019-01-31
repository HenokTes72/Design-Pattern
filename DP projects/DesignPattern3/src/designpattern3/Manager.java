/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Manager extends Person{
    List<Person> assistants;
    
    public Manager(String name, double salary) {
        super(name, salary);
        this.assistants = new ArrayList();
    }
    
    @Override
    public void addAssistant(Person assistant) {
        assistants.add(assistant);
    }

    @Override
    public List<Person> getAssistants() {
        return assistants;
    }
    
    @Override
    public double getSalary() {
        double total = this.salary;
        for(Person p: assistants) {
            total += p.getSalary();
        }
        return total;
    }
    
}
