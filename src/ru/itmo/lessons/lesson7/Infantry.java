package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;

public class Infantry extends BattleUnit {
    private int additionalAttack = 5;

    public Infantry (int healthScore, int attackScore) {
        super (healthScore, attackScore);
    }

    public void InfantryVoid () {
        System.out.println("Метод Infantry");
    }
}
