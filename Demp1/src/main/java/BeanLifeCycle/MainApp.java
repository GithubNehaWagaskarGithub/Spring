package BeanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Single s1=context.getBean("Sin",Single.class);
        Single s2=context.getBean("Sin",Single.class);

        System.out.println(s1==s2);//true bcs single will create only one Object

        Prototype p1=context.getBean("Pro", Prototype.class);
        Prototype p2=context.getBean("Pro", Prototype.class);

        System.out.println(p1==p2);// false bcs Prototype will create Multiple Object
    }
}
