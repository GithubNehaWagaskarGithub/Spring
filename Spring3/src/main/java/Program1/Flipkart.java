package Program1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("flipkart")
public class Flipkart implements Website {

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
        System.out.println("Buy Product from flipkart");
    }
}
