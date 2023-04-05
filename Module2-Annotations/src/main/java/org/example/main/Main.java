package org.example.main;

import org.example.config.ProjConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjConf.class);
        Person p1 = context.getBean(Person.class);
//        p1.setName("Gosha");
//        System.out.println(p1);
        System.out.println(p1.getName());
        System.out.println(p1);
    }
}