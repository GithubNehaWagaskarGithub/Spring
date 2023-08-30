package IOCAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Choice :");
        System.out.println("1 : DEV");
        System.out.println("2 :TEST");
        int ch=sc.nextInt();

        Course c1=null;
        if(ch==1)
        {
            //as a Id means name we have to provide Component Name
            c1=context.getBean("dev",SoftwareDev.class);
            c1.courseType();
            c1.courseSubjects();
        }
        else {
            c1=context.getBean("test",SoftwareTest.class);
            c1.courseType();
            c1.courseSubjects();
        }
    }
}
