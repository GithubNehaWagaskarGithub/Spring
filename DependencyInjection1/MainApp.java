package DependencyInjection1;

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
        int ch=sc.nextInt();
        Shop s1=null;
        if(ch==1)
        {
            s1=context.getBean("gShop", GlossaryShop.class);
        } else if (ch==2) {
            s1=context.getBean("eShop", ElectronicsShop.class);
        }
        else{
            System.out.println("Invalid Choice");
        }
        if(s1!=null)
        {
            s1.shopType();
            s1.productType();
        }
    }
}
