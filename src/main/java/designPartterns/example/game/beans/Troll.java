package designPartterns.example.game.beans;

import designPartterns.example.game.service.impl.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        super.weapon = new AxeBehavior();
    }

    @Override
    public void fight() {

    }
}
