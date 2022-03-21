package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.AttackAble;
import ru.itmo.lessons.lesson7.base.BattleUnit;

public final class Infantry extends BattleUnit implements AttackAble {
    private final int additionalAttack = 5;
    // Свойство только для чтения не для перезаписи
    // Значение можно задать только при объявлении
    // Или через конструктор
    public Infantry(int healthScore, int attackScore) {
        super(healthScore, attackScore);
    }

    public void InfantryVoid() {
        System.out.println("Метод Infantry");
    }

    // Переопределение метода родителя
    public boolean runFromField() {
        if (super.runFromField()) {
            attackScore = attackScore - 3;
            System.out.println("После бегства атака уменьшена на 3");
            return true;
        }
        return false;
        // Используем метод родителя и добавляем что-то свое вызовом super
        // через super можно вызвать любой метод родителя
        // Можно прописать собственную реализацию, перекрывающую метод родителя
    }

    @Override
    public void rest() {
        plusHealth(1);
        System.out.println("Отдых пехотинца");
    }

    @Override
    public void attack(BattleUnit enemy) {
        if (enemy.isAlive() && this.isAlive()) { // проверка на живость юнитов
            enemy.minusHealth(attackScore);
        } if (enemy.isAlive()) {
            enemy.runFromField();
        }
    }
}
