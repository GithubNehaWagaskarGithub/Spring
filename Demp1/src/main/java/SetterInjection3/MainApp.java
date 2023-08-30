package SetterInjection3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Choice :");
        System.out.println("1. Glossary Shop");
        System.out.println("2. Electronics Shop");
        int ch= sc.nextInt();
        if(ch==1)
        {
            Shop s1=context.getBean("GlossaryShop",GlossaryShop.class);
            s1.shopType();
            s1.productType();
        } else if (ch==2) {
            Shop s2=context.getBean("ElectronicsShop", ElectronicsShop.class);
            s2.shopType();
            s2.productType();
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
}
