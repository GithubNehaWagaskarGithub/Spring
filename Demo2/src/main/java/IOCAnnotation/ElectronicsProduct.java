package IOCAnnotation;

import org.springframework.stereotype.Component;

@Component("elePro")
public class ElectronicsProduct implements Product{
    @Override
    public void productType() {
        System.out.println("Electronics Product");
    }
}
