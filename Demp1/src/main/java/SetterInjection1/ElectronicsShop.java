package SetterInjection1;

public class ElectronicsShop implements Shop{
    private ElectronicsProduct ep;
    @Override
    public void shopType() {
        System.out.println("Electronics Shop");
    }

    public void setEp(ElectronicsProduct ep) {
        this.ep = ep;
    }

    @Override
    public void productType() {
    ep.productType();
    }
}
