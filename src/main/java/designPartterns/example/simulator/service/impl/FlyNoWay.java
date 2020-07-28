package designPartterns.example.simulator.service.impl;

import designPartterns.example.simulator.service.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
