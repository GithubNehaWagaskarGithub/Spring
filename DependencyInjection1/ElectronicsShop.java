package DependencyInjection1;

import org.springframework.beans.factory.annotation.Autowired;

public class ElectronicsShop implements Shop{
    @Autowired
    private Product product;
    @Override
    public void shopType() {
        System.out.println("Electronics Shop");
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public void productType() {

        product.productType();
    }
}
