package designPartterns.example.game.beans;

import designPartterns.example.game.service.impl.KnifeBehavior;

public class King extends Character {
    public King() {
        super.weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {

    }
}
