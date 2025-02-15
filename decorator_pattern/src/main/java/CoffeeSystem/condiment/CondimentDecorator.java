package CoffeeSystem.condiment;

import CoffeeSystem.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    //所有调料装饰者必须重新实现getDescription()
    public abstract String getDescription();
}
