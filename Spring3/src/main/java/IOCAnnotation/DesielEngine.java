package IOCAnnotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("dengine")
public class DesielEngine implements Engine{
    @Override
    public void engineType() {
        System.out.println("Desiel Engine");
    }
}
