package ru.mmasloboev.sinergycourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloBean helloBean = context.getBean("helloBean", HelloBean.class);

        System.out.println(helloBean.getHello());
    }
}
