/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class TanaUserData extends UserData{
    
    public TanaUserData(DrawingAPI dapi) {
        super(dapi);
        this.stockCard = new ArrayList();
        fillStockCard();
    }
    
    public void fillStockCard() {
        stockCard.add(new Item("Syinix 42", 3));
        stockCard.add(new Item("Samsung 180L", 2));
        stockCard.add(new Item("Syinix 55", 1));
        stockCard.add(new Item("Tecno W3", 8));
        stockCard.add(new Item("Mewe 32", 7));
    }
    
    @Override
    public void draw() {
        this.drawingAPI.draw(stockCard);
    } 
}
