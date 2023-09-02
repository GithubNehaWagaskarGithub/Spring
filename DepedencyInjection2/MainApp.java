package DepedencyInjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner sc=new Scanner(System.in);
        System.out.println("Select a Choice :");
        System.out.println("1. Dell");
        System.out.println("2. Hp");
        int ch=sc.nextInt();
        Laptop l1=null;
        if(ch==1)
        {
            l1=context.getBean("dell",Dell.class);
        } else if (ch==2) {
            l1=context.getBean("hp",Hp.class);
        }
        else{
            System.out.println("Invalid Choice");
        }
        if(l1!=null)
        {
            l1.laptopType();
            l1.processorType();
        }
    }
}
