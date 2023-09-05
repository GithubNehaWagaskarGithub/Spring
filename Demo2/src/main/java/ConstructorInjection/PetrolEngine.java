package ConstructorInjection;

import org.springframework.stereotype.Component;

@Component("PE")
public class PetrolEngine implements Engine{
    @Override
    public void engineType() {
        System.out.println("Petrol Engine");
    }
}
