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
public class ExecutiveView extends DrawingAPI{
    
    public ExecutiveView(Stock stock) {
        super(stock);
    }
    
    @Override
    public void draw(List<Item> items) {
        this.stock.rerenderByString(items, "JTable2");
    }
    
}
