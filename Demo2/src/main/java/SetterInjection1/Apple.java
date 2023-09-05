package SetterInjection1;



public class Apple implements Phone{
    private Battery battery;
    @Override
    public void phoneType() {
        System.out.println("Apple Phone");
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public void batteryType() {
        battery.batteryType();
    }
}
