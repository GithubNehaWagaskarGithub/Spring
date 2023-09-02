package ConstructorInjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MAinApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner sc=new Scanner(System.in);

        System.out.println("1. Breeza");
        System.out.println("2. HondaCity");
        System.out.println("Enter a Choice :");
        int ch=sc.nextInt();
        Car c1=null;
        if(ch==1)
        {
            c1=context.getBean("Breeza", Breeza.class);
        }
        else {
            c1=context.getBean("HondaCity", HondaCity.class);
        }
        c1.carType();
        c1.engineType();
    }
}
