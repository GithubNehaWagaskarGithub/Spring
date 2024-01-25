package DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sam")
public class Samsung implements Phone{
    //@Autowired
    @Autowired
    @Qualifier("LB")
    private Battery battery;
    @Override
    public void phoneType() {
        System.out.println("Samsung");
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public void BatteryType() {
        battery.batteryType();
    }
}
