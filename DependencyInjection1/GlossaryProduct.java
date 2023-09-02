package DependencyInjection1;

import org.springframework.stereotype.Component;

@Component("gPro")
public class GlossaryProduct implements Product{
    @Override
    public void productType() {
        System.out.println("Glossary Product");
    }
}
