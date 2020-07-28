package designPartterns.example.simulator.service.impl;

import designPartterns.example.simulator.service.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
