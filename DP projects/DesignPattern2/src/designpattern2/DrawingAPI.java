/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern2;

import java.util.List;

/**
 *
 * @author User
 */
public abstract class DrawingAPI {
    public Stock stock;
    
    public DrawingAPI(Stock stock) {
        this.stock = stock;
    }
    
    public abstract void draw(List<Item> items);
}
