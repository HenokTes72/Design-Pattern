/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern1;

/**
 *
 * @author User
 */
public abstract class SwimmersPrototype implements Cloneable {
    public SwimmersPrototype clone() throws CloneNotSupportedException{
        return (SwimmersPrototype)super.clone();
    }
}
