package Program1;

import org.springframework.stereotype.Component;

@Component("googlepay")
public class GooglePay implements Pay{

    @Override
    public void payType() {
        System.out.println("Google Pay");
    }
}
