package PizzaFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        PizzaFactory p1=context.getBean("factory", PizzaFactory.class);
        p1.pizzaType();
    }
}
