package SetterInjection1;



public class Samsung implements Phone{
    private Battery battery;
    @Override
    public void phoneType() {
        System.out.println("Samsung Phone");
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public void batteryType() {
        battery.batteryType();
    }
}
