package ConstructorInjection;

public class Apple implements Phone{
    private Battery battery;
    @Override
    public void phoneType() {
        System.out.println("Phone Type Is Apple");
    }

    public Apple(Battery battery) {
        this.battery = battery;
    }

    @Override
    public void batteryType() {
        battery.BatteryType();
    }
}
