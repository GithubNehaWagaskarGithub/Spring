package ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner sc=new Scanner(System.in);
        System.out.println("1. SamSung");
        System.out.println("2. Apple");
        System.out.println("Select a Choice :");
        int ch=sc.nextInt();
        Phone p1=null;
        if(ch==1)
        {
            p1=context.getBean("Samsung", Samsung.class);
        } else if (ch==2) {
            p1=context.getBean("Apple", Apple.class);
        }
        if(p1!=null)
        {
            p1.batteryType();
            p1.phoneType();
        }
    }
}
