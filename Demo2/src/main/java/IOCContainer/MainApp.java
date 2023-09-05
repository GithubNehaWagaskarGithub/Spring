package IOCContainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Engine p1=context.getBean("pe", PetrolEngine.class);
        p1.engineType();

        Engine p2=context.getBean("de", DesielEngine.class);
        p2.engineType();
    }
}
