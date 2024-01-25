package SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Apple a1=context.getBean("ap",Apple.class);
        a1.batteryType();
        a1.phoneType();

        Samsung a2=context.getBean("sp",Samsung.class);
        a2.batteryType();
        a2.phoneType();
    }
}
