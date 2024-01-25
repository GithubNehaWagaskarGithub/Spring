package IOCContainer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Engine e1=context.getBean("pe", PetrolEngine.class);
        e1.engineType();

        Engine e2=context.getBean("de", DesielEngine.class);
        e2.engineType();
    }
}
