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
public class SortFactory {
    public static SortStrategy getSortStrategy(String type) {
        SortStrategy s =  null;
        switch(type) {
            case "Age": s = new AgeSort();break;
            case "Name": s = new NameSort();break;
            case "Time": s = new TimeSort();break;
            case "Sex": s = new SexSort();break;
        }
        return s;
    }
}
