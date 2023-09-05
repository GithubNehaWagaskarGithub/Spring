package SetterInjection1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Choice :");
        System.out.println("1. Samsung");
        System.out.println("2. Apple");
        int ch=sc.nextInt();
        Phone p1=null;
        if(ch==1)
        {
            p1=context.getBean("samsung", Samsung.class);
        } else if (ch==2) {
            p1=context.getBean("apple", Apple.class);
        }
        else {
            System.out.println("Invalid Choice");
        }
        p1.phoneType();
        p1.batteryType();
    }
}
