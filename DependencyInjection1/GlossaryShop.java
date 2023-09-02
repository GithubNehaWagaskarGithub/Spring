package DependencyInjection1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

public class GlossaryShop implements Shop{
    @Autowired
    private Product product;
    @Override
    public void shopType() {
        System.out.println("Glossary Shop");
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public void productType() {
        product.productType();
    }
}
