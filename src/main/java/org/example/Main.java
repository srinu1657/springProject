package org.example;

import org.example.beans.A;
import org.example.scan.MyScan;
import org.parent.example.beans.C;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyScan.class);
        System.out.println("Main created context object ");
        A a = (A) annotationConfigApplicationContext.getBean("a");
        System.out.println("Main got A object");
        a.getResult();
    }
}