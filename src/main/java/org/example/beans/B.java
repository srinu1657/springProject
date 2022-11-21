package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class B {
public B(){
    System.out.println("B constrcuter");
}
    {
        System.out.println("B non stataic block");
    }
    static {
        System.out.println("B static blick");
    }
    public void getResult(){
        System.out.println("B result");
    }

}

