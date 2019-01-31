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
public class Normal extends Person{
    
    public Normal(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void addAssistant(Person assistant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Person> getAssistants() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
