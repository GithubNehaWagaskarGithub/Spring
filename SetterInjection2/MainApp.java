package SetterInjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Scanner sc=new Scanner(System.in);
        System.out.println("1. Amazon");
        System.out.println("2. Mintra");
        System.out.println("Enter a Choice :");
        int ch=sc.nextInt();

        if (ch==1)
        {
            Website w1=context.getBean("amazon",Amazon.class);
            w1.buyProduct();
            w1.paying();
        } else if (ch==2) {
            Website w2=context.getBean("mintra", Mintra.class);
            w2.buyProduct();
            w2.paying();
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
}
