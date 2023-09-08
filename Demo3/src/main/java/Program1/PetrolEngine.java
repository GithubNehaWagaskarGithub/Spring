package Program1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("pe")
public class PetrolEngine implements Engine{

    @Override
    public void engineType() {
        System.out.println("Petrol Engine");
    }
}
