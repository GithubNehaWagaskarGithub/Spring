package SetterInjection2;

public class PayTM implements Pay{
    @Override
    public void paying() {
        System.out.println("Pay By PayTM");
    }
}
