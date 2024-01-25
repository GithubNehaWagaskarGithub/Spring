package Program1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("amazon")//<context:component-scan base-package="DependencyInjection"></context:component-scan>
// must use in applicationContext.xml file

//Diff between primary and Qualifier=Primary is Default Implementation and Qualifier is Specific Implementation means Provides
// the highest Priority

public class Amazon implements Website{

    @Autowired//<context:annotation-config></context:annotation-config> must use in applicationContext.xml file
    @Qualifier("paytm")//this is applicable only Object is created with the help of Setter Injection
    private Pay pay;
    @Override
    public void payType() {
        pay.payType();
    }


    public void setPay(Pay pay) {
        this.pay = pay;
    }

    @Override
    public void buyProduct() {
        System.out.println("Buy Product from Amazon");
    }
}
