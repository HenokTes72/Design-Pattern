/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern1;

import java.util.List;

/**
 *
 * @author User
 */
public interface SortStrategy {
    List<Swimmer> sort(List<Swimmer> swimmers);
}
