package BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Singleton s1=context.getBean("sin", Singleton.class);
        Singleton s2=context.getBean("sin", Singleton.class);

        Prototype p1=context.getBean("pro", Prototype.class);
        Prototype p2=context.getBean("pro", Prototype.class);

        System.out.println(s1==s2);//means we can not create a multiple object of same class.by using Singleton scope
        // we can create only one object of particular class

        System.out.println(p1==p2);//By using Prototype scope we can create a multiple object of particular class.
    }
}
