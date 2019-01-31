/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Swimmers extends SwimmersPrototype{
    List<Swimmer> swimmers;
    SortStrategy sortStrategy;
    
    public Swimmers() {
        swimmers = new ArrayList();
    }
    
    @Override
    public SwimmersPrototype clone() throws CloneNotSupportedException{
        Swimmers swp = (Swimmers)super.clone();
        return swp;
    }
    
    public void setSortStrategyAndSort(SortStrategy s) {
        setSortStrategy(s);
        sort();
    }
    
    public void setSortStrategy(SortStrategy s){
        sortStrategy = s;
    }
    
    public void addSwimmer(Swimmer s){
        swimmers.add(s);
    }
    
    public List<Swimmer> sort() {
        return (swimmers = sortStrategy.sort(new ArrayList<>(swimmers)));
    }
    
    public List<Swimmer> getSwimmers() {
        return swimmers;
    }
}
