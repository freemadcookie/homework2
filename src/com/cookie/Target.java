package com.cookie;

public class Target {

    private int physicalDamage;
    private int fireDamage;
    private int iceDamage;


    public int getPhysicalDamage() {
        //задаем произвольный дамаг для физ урона
        physicalDamage = 20;
        return physicalDamage;
    }

    public int getFireDamage() {
        //задаем произвольный дамаг для огневого урона
        fireDamage = 40;
        return fireDamage;
    }

    public int getIceDamage() {
        //задаем произвольный дамаг для ледяного урона
        iceDamage = 50;
        return iceDamage;
    }


}
