package org.example.scan;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.example,org.parent.example")
public class MyScan {
    static{
        System.out.println("MyScan static block");
    }
    {
        System.out.println("MyScan non static block");
    }
   public MyScan(){
        System.out.println("MyScan construtor");
    }
}
