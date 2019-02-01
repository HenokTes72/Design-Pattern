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
public interface SortStrategy {
    List<Movie> sort(List<Movie> movies);
}
