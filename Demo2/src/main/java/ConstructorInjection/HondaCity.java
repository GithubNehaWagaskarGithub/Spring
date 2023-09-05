package ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("HondaCity")
public class HondaCity implements Car{
    private Engine engine;
    @Override
    public void carType() {
        System.out.println();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void engineType() {
        engine.engineType();
    }

}
