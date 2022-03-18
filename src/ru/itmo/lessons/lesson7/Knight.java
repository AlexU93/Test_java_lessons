package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;

public class Knight extends BattleUnit {
    private int additionalHealth = 10; // У всех рыцарей доп здоровье 10, всегда

    public Knight(int healthScore, int attackScore) { // Метод
        super(healthScore, attackScore);
    }

    public void KnightVoid() {
        System.out.println("Метод Knight");
    }
}

