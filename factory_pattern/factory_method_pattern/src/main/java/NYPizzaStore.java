import pizza.*;
import pizza.ny_pizza.NYStyleCheesePizza;
import pizza.ny_pizza.NYStyleClamPizza;
import pizza.ny_pizza.NYStylePepperoniPizza;
import pizza.ny_pizza.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
