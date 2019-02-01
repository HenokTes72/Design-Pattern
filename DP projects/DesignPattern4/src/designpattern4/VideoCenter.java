/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public interface VideoCenter {
    public abstract void subscribe(Person p);
    public abstract void unsubscribe(Person p);
    public abstract void notifyUsers();
}
