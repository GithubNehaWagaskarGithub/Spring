package SetterInjection1;

public class GlossaryShop implements Shop{
    private GlossaryProduct gp;
    @Override
    public void shopType() {
        System.out.println("Glossary Shop");
    }

    public void setGp(GlossaryProduct gp) {
        this.gp = gp;
    }

    @Override
    public void productType() {
        gp.productType();
    }
}
