package designPartterns.example.simulator.beans;

import designPartterns.example.simulator.service.impl.FlyNoWay;
import designPartterns.example.simulator.service.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.printf("I'm a model duck!");
    }
}
