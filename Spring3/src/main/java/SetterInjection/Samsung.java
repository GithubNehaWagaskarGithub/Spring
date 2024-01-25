package SetterInjection;

public class Samsung implements Phone{

    private Battery normalBattery;
    @Override
    public void phoneType() {
        System.out.println("Samsung Phone");
    }

    public void setNormalBattery(NormalBattery normalBattery) {
        this.normalBattery = normalBattery;
    }

    @Override
    public void batteryType() {
        normalBattery.batterType();
    }
}
