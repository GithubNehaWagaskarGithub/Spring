package SetterInjection2;

public class Mintra implements Website{
    private PayTM pt;
    @Override
    public void buyProduct() {
        System.out.println("Purchase Product By Mintra");
    }

    public void setPt(PayTM pt) {
        this.pt = pt;
    }

    @Override
    public void paying() {
    pt.paying();
    }
}
