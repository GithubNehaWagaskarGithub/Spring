package DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component("LB")
public class LithiumBattery implements Battery{
    @Override
    public void batteryType() {
        System.out.println("Lithium Battery");
    }
}
