package IOCAnnotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("pengine")
public class PetrolEngine implements Engine{
    @Override
    public void engineType() {
        System.out.println("Petrol Engine");
    }
}
