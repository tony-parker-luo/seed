package designPartterns.example.game.service.impl;

import designPartterns.example.game.service.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use knife");
    }
}
