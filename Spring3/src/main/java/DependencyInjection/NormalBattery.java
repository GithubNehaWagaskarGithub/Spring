package DependencyInjection;

import org.springframework.stereotype.Component;

@Component("NB")
public class NormalBattery implements Battery{
    @Override
    public void batteryType() {
        System.out.println("NormalBattery");
    }
}
