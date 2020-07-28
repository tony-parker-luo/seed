package designPartterns.example.game.service.impl;

import designPartterns.example.game.service.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use sword");
    }
}
