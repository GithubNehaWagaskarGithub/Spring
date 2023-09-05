package ConstructorInjection1;

public class GlossaryShop implements Shop{
    private Product product;
    @Override
    public void shopType() {
        System.out.println("Glossary Shop");
    }

    public GlossaryShop(Product product) {
        this.product = product;
    }

    @Override
    public void productType() {
        product.productType();
    }
}
