package DepedencyInjection;

public class ElectronicsShop implements Shop{

    private ElectronicsProduct electronicsProduct;
    @Override
    public void shopType() {
        System.out.println("Electronics Shop");
    }

    public void setElectronicsProduct(ElectronicsProduct electronicsProduct) {
        this.electronicsProduct = electronicsProduct;
    }

    @Override
    public void productType() {
        electronicsProduct.productType();
    }
}
