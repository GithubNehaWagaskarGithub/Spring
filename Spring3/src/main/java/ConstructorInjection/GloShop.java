package ConstructorInjection;

public class GloShop implements Shop{

    private Product gloProduct;
    @Override
    public void shopType() {
        System.out.println("Glo Shop");
    }

    public GloShop(Product product) {
        this.gloProduct = product;
    }

    @Override
    public void productType() {
        gloProduct.productType();
    }
}
