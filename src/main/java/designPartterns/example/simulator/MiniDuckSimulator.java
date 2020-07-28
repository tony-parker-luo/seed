package designPartterns.example.simulator;

import designPartterns.example.simulator.beans.Duck;
import designPartterns.example.simulator.beans.MallardDuck;
import designPartterns.example.simulator.beans.ModelDuck;
import designPartterns.example.simulator.service.impl.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("==================================");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
