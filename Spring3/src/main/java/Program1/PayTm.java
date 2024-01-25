package Program1;

import org.springframework.stereotype.Component;

@Component("paytm")
public class PayTm implements Pay{
    @Override
    public void payType() {
        System.out.println("PayTm Pay");
    }
}
