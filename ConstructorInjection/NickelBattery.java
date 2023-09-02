package ConstructorInjection;

public class NickelBattery implements Battery{
    @Override
    public void BatteryType() {
        System.out.println("Battery Type Is Nickel Battery");
    }
}
