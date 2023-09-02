package SetterInjection2;

public class Amazon implements Website{
    private GooglePay gp;
    @Override
    public void buyProduct() {
        System.out.println("Purchase Product By Amazon");
    }

    public void setGp(GooglePay gp) {
        this.gp = gp;
    }

    @Override
    public void paying() {
        gp.paying();
    }
}
