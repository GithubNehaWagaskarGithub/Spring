package ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Verna")
public class Verna implements Car{
    @Autowired
    @Qualifier("PE")
    private Engine engine;
    @Override
    public void carType() {
        System.out.println("Verna");
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void engineType() {
        engine.engineType();
    }
}
