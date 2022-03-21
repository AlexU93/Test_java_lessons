package ru.itmo.lessons.lesson7.base;

import ru.itmo.lessons.lesson7.Infantry;
import ru.itmo.lessons.lesson7.Knight;

// Наследование классом BattleUnit класса Unit (родительский класс)
// множественное наследование классов запрщенно, после extends стоит одно название класса
// наследуются методы и свойтсва(переменные) родительского класса
// Конструкторы не наследуются
abstract public class BattleUnit extends Unit implements AttackAble {
    protected int attackScore;

    public BattleUnit(int healthScore, int attackScore) { // Конструктор
        super(healthScore); // вызов конструктора родителя // значение передается как только он завершиться в род-ом классе
        if (attackScore < 1) {
            throw new IllegalArgumentException("Атака должна быть положительной");
        }
        this.attackScore = attackScore;
    }

    public int getAttackScore() {
        return attackScore;
    }

    // Переопределить final нельзя
    public final void battleUnitVoid() {
        System.out.println();
    }

    public boolean runFromField() {
        if (!isAlive()) {
            System.out.println("Юнит не может с поля боя");
            return false;
        }
        healthScore -= 1;
        if (!isAlive()) {
            System.out.println("Юнит умер");
            return false;
        }
        return true;
    }

    // метод генерации боевых юнитов
    // static - создание экземпляров
    // фабричные методы
    public static BattleUnit getBattleUnit() {
        String[] types = {"knight", "infantry"};
        BattleUnit unit = null;
        switch (types[(int) (Math.random() * types.length)]) {
            case "knight":
                unit = new Knight(30, 50);
                break;
            case "infantry":
                unit = new Infantry(40, 20);
                break;
        }
        return unit;
    }

    public static BattleUnit [] getBattleUnits(int count) {
        BattleUnit[] units = new BattleUnit[count];
        for (int i=0; i < units.length; i++) {
            units [i] = getBattleUnit();
        }
        return units;
    }

}
