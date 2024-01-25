package SetterInjection;

public class NormalBattery implements Battery{
    @Override
    public void batterType() {
        System.out.println("Normal Battery");
    }
}
