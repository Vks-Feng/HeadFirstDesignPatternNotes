import pizza.Pizza;
import pizza.chicago_pizza.ChicagoStyleCheesePizza;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return null;
        } else if (type.equals("clam")) {
            return null;
        } else if (type.equals("veggie")) {
            return null;
        } else {
            return null;
        }
    }
}
