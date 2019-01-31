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
public class Swimmer {
    String name;
    int age;
    char sex;
    String time;
    
    public Swimmer(String name, int age, char sex, String time) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.time = time;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getTime() {
        return this.time;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public char getSex() {
        return this.sex;
    }
}
