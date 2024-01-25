package DepedencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Shop s1=context.getBean("gs",GlossaryShop.class);
        s1.shopType();
        s1.productType();

        Shop s2=context.getBean("es", ElectronicsShop.class);
        s2.shopType();
        s2.productType();
    }
}
