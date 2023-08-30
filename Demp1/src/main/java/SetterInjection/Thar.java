package SetterInjection;

public class Thar implements Car{
    private PetrolEngine petrolEngine;
    @Override
    public void carType() {
        System.out.println("Thar");
    }

    public void setPetrolEngine(PetrolEngine petrolEngine) {
        this.petrolEngine = petrolEngine;
    }

    @Override
    public void engineType() {
        petrolEngine.engineType();
    }
}
