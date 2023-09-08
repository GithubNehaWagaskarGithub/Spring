package Program1;

import org.springframework.stereotype.Component;

@Component("de")
public class DesielEngine implements Engine{

    @Override
    public void engineType() {
        System.out.println("Desiel Engine");
    }
}
