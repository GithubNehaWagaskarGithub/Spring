package SetterInjection;

public class Apple implements Phone{

    private Battery lithiumBattery;
    @Override
    public void phoneType() {
        System.out.println("Apple Phone");
    }

    public void setLithiumBattery(LithiumBattery lithiumBattery) {
        this.lithiumBattery = lithiumBattery;
    }

    @Override
    public void batteryType() {
        lithiumBattery.batterType();
    }
}
