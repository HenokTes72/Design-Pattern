/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern4;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class PersonImpl extends Person {

    public PersonImpl(String name, int age, VideoCenter videoCenter) {
        super(name, age, videoCenter);
    }
    
    @Override
    public void showUpdated(Movie m) {
        JOptionPane.showMessageDialog(null,this.name+ ": Move, "+m.getName()+" has been added");
    }
    
}
