package Program1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Choice :");
        System.out.println("1. HondaCity");
        System.out.println("2. Verna");
        int ch=sc.nextInt();
        Car c1=null;
        if(ch==1)
        {
            c1=context.getBean("hc", HondaCity.class);
        } else if (ch==2) {
            c1=context.getBean("ve", Verna.class);
        }
        else {
            System.out.println("Invalid Choice");
        }
        c1.carType();
        c1.engineType();
    }
}
