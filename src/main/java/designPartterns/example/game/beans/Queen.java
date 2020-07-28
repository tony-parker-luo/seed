package designPartterns.example.game.beans;

import designPartterns.example.game.service.impl.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        super.weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {

    }
}
