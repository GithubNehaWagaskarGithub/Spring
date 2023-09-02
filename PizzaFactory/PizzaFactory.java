package PizzaFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PizzaFactory {
    @Autowired
    @Qualifier("veg")//It is provides the Highest Priority
    private Pizza pizza;

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    void pizzaType()
    {
        pizza.pizzaType();
    }
}
