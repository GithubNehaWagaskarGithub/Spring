package ConstructorInjection;

import org.springframework.stereotype.Component;

@Component("DE")
public class DesielEngine implements Engine{
    @Override
    public void engineType() {
        System.out.println("Desiel Engine");
    }
}
