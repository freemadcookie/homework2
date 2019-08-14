package com.cookie;

public class Main {
    public static void main(String[] args) {
        //инициализируем классы
        MeleeWeapon mw = new MeleeWeapon();
        RangedWeapon rw = new RangedWeapon();
        Target target = new Target();

        //бьем по цели выбранным оружием.
        mw.hit(target);
        rw.hit(target);

    }
}
