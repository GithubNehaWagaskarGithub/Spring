package IOCAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Product p1=context.getBean("gloPro", GlossaryProduct.class);
        p1.productType();

        Product p2=context.getBean("elePro", ElectronicsProduct.class);
        p2.productType();
    }
}
