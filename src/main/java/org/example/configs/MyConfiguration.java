package org.example.configs;


import org.example.beans.B;
import org.parent.example.beans.C;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    public MyConfiguration(){
        System.out.println("MyConfiguration consturctor");
    }
    static{

        System.out.println("MyConfiguration static block");
    }

   //@Bean
  // public C getC(){
    // System.out.println("C bean creation");
      // C c=new C();
        //return c;
    //}

  //  @Bean("b")
    public B getB(){
        System.out.println("B bean creation");
        B b=new B();
        return b;
    }

}
