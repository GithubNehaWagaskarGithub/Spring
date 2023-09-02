package DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class HondaCity implements Car{
    @Autowired  //It provides a responsibility on spring to create an object of another class inside current class
    private PetrolEngine petrolEngine;
    @Override
    public void carType() {
        System.out.println("HondaCity");
    }

    public void setPetrolEngine(PetrolEngine petrolEngine) {
        this.petrolEngine = petrolEngine;
    }

    @Override
    public void engineType() {
        petrolEngine.engineType();
    }
}
