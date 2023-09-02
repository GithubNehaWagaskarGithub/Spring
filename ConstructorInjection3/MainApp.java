package ConstructorInjection3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Calculator c1=context.getBean("sub", Calculator.class);
        c1.sub();
    }
}
