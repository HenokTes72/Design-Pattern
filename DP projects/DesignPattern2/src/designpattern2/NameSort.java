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
public class NameSort implements SortStrategy{
    
    @Override
    public List<Item> sort(List<Item> items) {
        items.sort((obj1, obj2) -> obj1.getName().compareTo(obj2.getName()));
        return items;
    }
}
