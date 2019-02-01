/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class TanaVideoCenter implements VideoCenter{
    public List<Movie> movies;
    public List<Person> persons;
    SortStrategy sortStrategy;
    
    public TanaVideoCenter() {
        movies = new ArrayList();
        persons = new ArrayList();
    }
    
    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
    
    public List<Movie> sort() {
        return sortStrategy.sort(movies);
    }
    
    public void add(Movie m) {
        this.movies.add(m);
        notifyUsers();
    }
    
    public List<Movie> getMovies() {
        return this.movies;
    }
    
    public List<Person> getSubscribers() {
        return this.persons;
    }

    @Override
    public void subscribe(Person p) {
        this.persons.add(p);
    }

    @Override
    public void unsubscribe(Person p) {
        int i = persons.indexOf(p);
        if(i >= 0) {
            persons.remove(p);
        }    
    }

    @Override
    public void notifyUsers() {
        for(int i=0; i<persons.size(); i++) {
            Person user = (Person)persons.get(i);
            user.showUpdated(this.movies.get(this.movies.size()-1));
        }
    }
}
