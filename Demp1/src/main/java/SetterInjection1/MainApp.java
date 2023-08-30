package SetterInjection1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("SELECT ONE OPTION :");
        System.out.println("1. GLOSSARY SHOP");
        System.out.println("2. ELECTRONIC SHOP");
        int choice=sc.nextInt();
        if (choice==1)
        {
            Shop s1=context.getBean("GloShop", GlossaryShop.class);
            s1.shopType();
            s1.productType();
        } else if (choice==2)
        {
            Shop s1=context.getBean("EleShop", ElectronicsShop.class);
            s1.shopType();
            s1.productType();
        }
        else
        {
            System.out.println("INVALID CHOICE !!");
        }
    }
}
