package org.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {
    private String name;
    private final Parrot parrot;
    @Autowired
    public Person(Parrot parrot){
        this.parrot = parrot;
    }
    @PostConstruct
    public void init(){
        this.name = "Pasha";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    @Override
    public String toString() {
        return "Person's parrot: " + parrot;
    }
}
