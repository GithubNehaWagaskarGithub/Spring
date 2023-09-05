package DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Choice :");
        System.out.println("1. Lenovo");
        System.out.println("2. Dell");
        int ch=sc.nextInt();
        Laptop l1=null;
        if(ch==1)
        {
            l1=context.getBean("lenovo", Lenovo.class);
        } else if (ch==2) {
            l1=context.getBean("dell", Dell.class);
        }
        else {
            System.out.println("Invalid Choice");
        }
        l1.laptopType();
        l1.processorType();
    }
}
