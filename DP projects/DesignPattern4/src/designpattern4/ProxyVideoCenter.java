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
public class ProxyVideoCenter implements VideoCenter{
    public VideoCenter realVideoCenter;
    
    public ProxyVideoCenter(VideoCenter realVideoCenter) {
        this.realVideoCenter = realVideoCenter;
    }

    @Override
    public void subscribe(Person p) {
        checkAge(p);
    }

    @Override
    public void unsubscribe(Person p) {
        checkAge(p);
    }

    @Override
    public void notifyUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void checkAge(Person p) {
        if(p.getAge() > 18) {
            realVideoCenter.subscribe(p);
        }
        else {
            JOptionPane.showMessageDialog(null,p.getName()+ " you are not allowed to subscribe for this video center","check task",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
