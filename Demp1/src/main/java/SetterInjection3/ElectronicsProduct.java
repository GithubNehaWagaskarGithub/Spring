package SetterInjection3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("EleProduct")
@Scope("prototype")
public class ElectronicsProduct implements Product{
    @Override
    public void productType() {
        System.out.println("Electronics Product");
    }
}
