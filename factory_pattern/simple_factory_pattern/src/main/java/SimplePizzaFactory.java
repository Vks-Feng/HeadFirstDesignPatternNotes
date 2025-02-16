/**
 * 只做一件事：为客户创建披萨
 */
public class SimplePizzaFactory {

    /**
     * 客户用此方法实例化新对象
     * @param type 披萨类型
     * @return 相应类型的披萨
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
