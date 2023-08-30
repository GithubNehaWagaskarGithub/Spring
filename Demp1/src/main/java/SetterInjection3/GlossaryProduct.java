package SetterInjection3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("GloProduct")
@Scope("prototype")
public class GlossaryProduct implements Product{
    @Override
    public void productType() {
        System.out.println("Glossary Product");
    }
}
