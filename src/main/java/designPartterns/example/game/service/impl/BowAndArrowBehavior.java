package designPartterns.example.game.service.impl;

import designPartterns.example.game.service.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use bow and arrow");
    }
}
