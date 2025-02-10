package HeadFirst.Duck;

import HeadFirst.Duck.duck.Duck;
import HeadFirst.Duck.duck.MallardDuck;
import HeadFirst.Duck.duck.ModelDuck;
import HeadFirst.Duck.fly.FlyBehavior;
import HeadFirst.Duck.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.perfromQuack();
        mallard.performFly();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior((FlyBehavior) new FlyRocketPowered());
        model.performFly();
    }
}
