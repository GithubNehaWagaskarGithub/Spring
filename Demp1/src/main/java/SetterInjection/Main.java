package SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Enter a Choice :");
        System.out.println("1. Thar");
        System.out.println("2. HondaCity");
        int ch=sc.nextInt();
        if(ch==1)
        {
            Car c1=context.getBean("thar", Thar.class);
            c1.carType();
            c1.engineType();
        } else if (ch==2) {
            Car c2=context.getBean("hondacity", HondaCity.class);
            c2.carType();
            c2.engineType();
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
}
