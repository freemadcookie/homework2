package com.cookie;

public class MeleeWeapon extends Weapon {

    @Override
    public void hit(Target target) {
        //Выводим информацию о типе выбранного оружия
        System.out.println("Melee weapon selected...");
        //Наносим урон
        super.hit(target);
    }
}