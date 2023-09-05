package ConstructorInjection1;

public class ElectronicsShop implements Shop{
    private Product product;
    @Override
    public void shopType() {
        System.out.println("Electronics Shop");
    }

    public ElectronicsShop(Product product) {
        this.product = product;
    }

    @Override
    public void productType() {
        product.productType();
    }
}
