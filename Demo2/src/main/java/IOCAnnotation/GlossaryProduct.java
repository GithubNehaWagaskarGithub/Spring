package IOCAnnotation;

import org.springframework.stereotype.Component;

@Component("gloPro")
public class GlossaryProduct implements Product{
    @Override
    public void productType() {
        System.out.println("Glossary Product");
    }
}
