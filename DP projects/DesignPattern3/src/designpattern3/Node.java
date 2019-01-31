/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern3;

/**
 *
 * @author User
 */
public class Node {
    int left;
    int top;
    
    public Node(int left, int top){
        this.left = left;
        this.top = top;
    }
    
    public int getLeft() {
        return left;
    }
    
    public int getTop() {
        return top;
    }
}
