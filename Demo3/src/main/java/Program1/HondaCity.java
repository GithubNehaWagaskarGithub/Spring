package Program1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hc")
public class HondaCity implements Car{
    @Autowired
    private Engine engine;

    @Override
    public void carType() {
        System.out.println("HondaCity");
    }

    @Override
    public void engineType() {
        engine.engineType();
    }
}
