package Program1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ve")
public class Verna implements Car{

    @Autowired
    private Engine engine;

    @Override
    public void carType() {
        System.out.println("Verna");
    }

    @Override
    public void engineType() {
        engine.engineType();
    }
}
