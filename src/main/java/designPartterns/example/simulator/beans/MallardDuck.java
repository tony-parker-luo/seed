package designPartterns.example.simulator.beans;

import designPartterns.example.simulator.service.impl.FlyWithWings;
import designPartterns.example.simulator.service.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {

    }
}
