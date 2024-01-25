package DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("app")
public class Apple implements Phone {


    private Battery battery;
    @Override
    public void phoneType() {
        System.out.println("Apple Phone");
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public void BatteryType() {
       battery.batteryType();
    }
}
