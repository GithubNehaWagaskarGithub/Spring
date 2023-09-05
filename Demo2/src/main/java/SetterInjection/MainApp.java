package SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Engineer e1=context.getBean("e",Engineer.class);
        e1.designType();
        e1.getSubjects();
        e1.eachSubjectPrice(8000);
    }
}
