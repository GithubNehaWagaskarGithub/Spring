package ConstructorInjection;

public class EleShop implements Shop{

    private Product eleProduct;
    @Override
    public void shopType() {
        System.out.println("Ele Shop");
    }

    public EleShop(Product eleProduct) {
        this.eleProduct = eleProduct;
    }

    @Override
    public void productType() {
        eleProduct.productType();
    }
}
