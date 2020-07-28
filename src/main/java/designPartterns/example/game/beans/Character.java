package designPartterns.example.game.beans;

import designPartterns.example.game.service.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    public Character() {
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public abstract void fight();
}
