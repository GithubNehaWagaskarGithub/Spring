package ConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Shop s1=context.getBean("gloShop", Shop.class);
        s1.productType();
        s1.shopType();

        Shop s2=context.getBean("eleShop", EleShop.class);
        s2.shopType();
        s2.productType();
    }
}
