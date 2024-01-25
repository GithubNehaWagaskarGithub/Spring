package Program1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Website w1=context.getBean("amazon", Amazon.class);
        w1.buyProduct();
        w1.payType();

        Website w2=context.getBean("flipkart", Flipkart.class);
        w2.buyProduct();
        w2.payType();

    }
}
