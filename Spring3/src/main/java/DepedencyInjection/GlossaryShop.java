package DepedencyInjection;

public class GlossaryShop implements Shop{

    private GlossaryProduct glossaryProduct;
    @Override
    public void shopType() {
        System.out.println("Glossary Shop");
    }

    public void setGlossaryProduct(GlossaryProduct glossaryProduct) {
        this.glossaryProduct = glossaryProduct;
    }

    @Override
    public void productType() {
        glossaryProduct.productType();
    }
}
