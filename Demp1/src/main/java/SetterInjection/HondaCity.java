package SetterInjection;

public class HondaCity implements Car{
    private DesielEngine desielEngine;
    @Override
    public void carType() {
        System.out.println("HondaCity");
    }

    public void setDesielEngine(DesielEngine desielEngine) {
        this.desielEngine = desielEngine;
    }

    @Override
    public void engineType() {
        desielEngine.engineType();
    }
}
