/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern4;

import java.util.List;

/**
 *
 * @author User
 */
public class PriceSort implements SortStrategy{
        
    @Override
    public List<Movie> sort(List<Movie> movies) {
        movies.sort((obj1, obj2) -> obj1.getPrice()-obj2.getPrice());
        return movies;
    }
}
