/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern4;

/**
 *
 * @author User
 */
public abstract class Person {
    public VideoCenter videoCenter;
    public String name;
    public int age;
    
    public Person(String name, int age, VideoCenter videoCenter) {
        this.name = name;
        this.age = age;
        this.videoCenter = videoCenter;
    }
    
    public void subscribe() {
        videoCenter.subscribe(this);
    }
    
    public void unsubscibe() {
        videoCenter.unsubscribe(this);
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public abstract void showUpdated(Movie m);
}
