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
public abstract class UserData {
    DrawingAPI drawingAPI;
    SortStrategy sortStrategy;
    List<Item> stockCard;
    
    public UserData(DrawingAPI dapi) {
        this.drawingAPI = dapi;
    }
    
    public void setDrawingAPI(DrawingAPI dapi) {
        this.drawingAPI = dapi;
    }
    
    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
 
    public List<Item> sort() {
        return sortStrategy.sort(stockCard);
    }
    
    public abstract void draw();
}
