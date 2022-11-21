package org.example.beans;

import org.parent.example.beans.C;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class A {
    @Value("srinivas")
    public String name;

    @Value("1234")
    public int id;

    @Autowired
    C c;

    {
        System.out.println("A non static block");
    }
    static {
        System.out.println("A static block");
    }
   public A(){
        System.out.println("A constructor");
    }
    public void getResult(){
        System.out.println("A getResult method and calling get Result on C");
        c.getResult(name,id);
    }
}
