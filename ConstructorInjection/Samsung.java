package ConstructorInjection;

public class Samsung implements Phone{
    private Battery battery;
    @Override
    public void phoneType() {
        System.out.println("Phone Type Is Samsung");
    }

    public Samsung(Battery battery) {
        this.battery = battery;
    }

    @Override
    public void batteryType() {
        battery.BatteryType();
    }
}
