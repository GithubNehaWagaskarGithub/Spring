package IOCContainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Engine e1=context.getBean("petrolObject", PetrolEngine.class);
        e1.engineType();

        Engine e2=context.getBean("desielObject", DesielEngine.class);
        e2.engineType();
    }
}
