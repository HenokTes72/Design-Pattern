/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern2;

/**
 *
 * @author User
 */
public class Item {
    public String name;
    public int numberOfShipped;
    
    public Item(String name, int qty) {
        this.name = name;
        this.numberOfShipped = qty;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getNumberOfShipped() {
        return this.numberOfShipped;
    }
}
