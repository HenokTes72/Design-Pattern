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
public class SortFactory {
    public static SortStrategy getSortStrategy(String type) {
        SortStrategy s =  null;
        switch(type) {
            case "Name": s = new NameSort();break;
            case "Qty": s = new QuantitySort();break;
        }
        return s;
    }
}
