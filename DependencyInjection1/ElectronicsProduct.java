package DependencyInjection1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("ePro")
@Primary
public class ElectronicsProduct implements Product{
    @Override
    public void productType() {
        System.out.println("Electronics Product");
    }
}
