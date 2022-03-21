package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.AttackAble;
import ru.itmo.lessons.lesson7.base.BattleUnit;
// класс Knight реализует интнрфейс AttackAble
// Можно реализовывать несколько интерфейсов Implements Int1, Int2....
// Класс обязан реализовать все методы интерфейсов
public final class Knight extends BattleUnit implements AttackAble { // final - Запрещает наследование
    private final int additionalHealth = 10; // У всех рыцарей доп здоровье 10, всегда

    public  Knight(int healthScore, int attackScore) { // Метод
        super(healthScore, attackScore);
    }

    public void KnightVoid() {
        System.out.println("Метод Knight");
    }

    @Override
    public void rest() {
        plusHealth(2);
        System.out.println("Отдых рыцаря");
    }

    @Override
    public void attack(BattleUnit enemy) {
        if (enemy.isAlive() && this.isAlive()) { // проверка на живость юнитов
            enemy.minusHealth(attackScore);
            if (enemy.isAlive()) {
                this.minusHealth(enemy.getHealthScore()); //если true то отнимаем здоровье у текущего юнита, значение атаки enemy
            }
        }
    }
}

