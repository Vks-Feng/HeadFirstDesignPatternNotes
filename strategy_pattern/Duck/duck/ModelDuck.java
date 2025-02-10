package HeadFirst.Duck.duck;

import HeadFirst.Duck.fly.FlyNoWay;
import HeadFirst.Duck.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a model duck");
    }
}
