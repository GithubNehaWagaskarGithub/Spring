package SetterInjection;

public class LithiumBattery implements Battery{
    @Override
    public void batterType() {
        System.out.println("Lithium Battery");
    }
}
