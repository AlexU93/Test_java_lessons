package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;
import ru.itmo.lessons.lesson7.base.Unit;

public class King extends Unit {
    private int gold = 500;
    private BattleUnit [] army;
    // Армия состоит из пехоты и рыцарей
    // Можно создавать таким образом (BattleUnit i = new Infantry) из за наследования

    public  King (int healthScore) {
        super (healthScore);
    }
}
