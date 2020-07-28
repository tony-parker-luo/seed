package designPartterns.example.simulator.service.impl;

import designPartterns.example.simulator.service.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
