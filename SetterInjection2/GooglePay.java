package SetterInjection2;

public class GooglePay implements Pay{
    @Override
    public void paying()
    {
        System.out.println("Pay By Google Pay");
    }
}
