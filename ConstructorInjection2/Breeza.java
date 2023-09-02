package ConstructorInjection2;

public class Breeza implements Car{
    private PetrolEngine petrolEngine;
    @Override
    public void carType() {
        System.out.println("Breeza");
    }

    public Breeza(PetrolEngine petrolEngine) {
        this.petrolEngine = petrolEngine;
    }

    @Override
    public void engineType() {
        petrolEngine.engineType();
    }
}
