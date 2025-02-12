package Duck;

import Duck.duck.Duck;
import Duck.duck.MallardDuck;
import Duck.duck.ModelDuck;
import Duck.fly.FlyBehavior;
import Duck.fly.FlyRocketPowered;

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
