package com.cookie;

import java.util.Random;

public class Weapon {

    //задаем рандом для попадания. границы - до 100
    private final Random random = new Random();
    private int randomInt = random.nextInt(100);

    private int physicalDamage;
    private int fireDamage;
    private int iceDamage;

    public void hit(Target target) {

        //задаем рандом на доп. урон. 0 - нет доп. урона, 1 - урон огнем, 2 - урон льдом
        final Random random = new Random();
        int randomAdditional = random.nextInt(3);

        //если больше 30 = попали, то выводим информацию об уроне
        if (randomInt > 30)
        {
            //получаем значения из класса Target для физ. урона
            physicalDamage = target.getPhysicalDamage();
            if (randomAdditional == 0) {
                System.out.println("Hitting target with [" + physicalDamage + "] physical damage!");
            }
            else if (randomAdditional == 1)
            {
                //получаем значения из класса Target для огн. урона
                fireDamage = target.getFireDamage();
                System.out.println("Hitting target with [" + physicalDamage + "] physical damage"
                        + " and additional [" + fireDamage + "] fire damage!");
            }
            else if (randomAdditional == 2)
            {
                //получаем значения из класса Target для лед. урона
                iceDamage = target.getIceDamage();
                System.out.println("Hitting target with [" + physicalDamage + "] physical damage"
                        + " and additional [" + iceDamage + "] ice damage!");
            }
        }
        //если не попали
        else
        {
           System.out.println("Missed!");
        }
    }

}


