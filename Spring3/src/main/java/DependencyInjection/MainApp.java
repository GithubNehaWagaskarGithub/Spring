package DependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Phone p1=context.getBean("sam", Samsung.class);
        p1.BatteryType();
        p1.phoneType();


    }
}
