package designPartterns.example.game.beans;

import designPartterns.example.game.service.impl.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        super.weapon = new SwordBehavior();
    }

    @Override
    public void fight() {

    }
}
