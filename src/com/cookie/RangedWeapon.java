package com.cookie;

public class RangedWeapon extends Weapon{

    @Override
    public void hit(Target target) {
        //Выводим информацию о типе выбранного оружия
        System.out.println("Ranged weapon selected...");
        //Наносим урон
        super.hit(target);
    }
}
