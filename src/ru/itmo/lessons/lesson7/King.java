package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;
import ru.itmo.lessons.lesson7.base.Unit;

public final class King extends Unit {
    private int gold = 500;
    private BattleUnit[] army;
    // Армия состоит из пехоты и рыцарей
    // Можно создавать таким образом (BattleUnit i = new Infantry) из за наследования

    public King(int healthScore) {
        super(healthScore);
    }

    @Override // реализация метода rest для King
    public void rest() {
        gold -= 50;
        plusHealth(5);
        System.out.println("Отдых короля");
    }

    public void generateArmy() {
        if (gold < 250) {
            System.out.println("Нехватает золота");
            return;
        }
        gold -= 250;
        army = BattleUnit.getBattleUnits(20); // создается массив для хранения экземпляров BattleUnit из count элементов

    }

    public void changeUnits() {
        if (gold < 20) {
            System.out.println("Нужно 20 золота");
            return; // Прерываем работу метода
        }
        for (int i = 0; i < army.length; i++) {
            if (army[i] != null && !army[i].isAlive()) {
                gold -= 20;
                army[i] = BattleUnit.getBattleUnit(); // замена на рандомного юнита
            }
        }
    }

    public void startBattle(King enemy) {
        // for (BattleUnit battleUnit : army) { // Генерация через iter
        for (int i = 0; i < army.length; i++) {
            int unitIndex = (int) (Math.random() * army.length);
            int enemyUnitIndex = (int) (Math.random() * enemy.army.length);
            army[unitIndex].attack(enemy.army[enemyUnitIndex]);
            army[unitIndex].rest();
            enemy.army[enemyUnitIndex].rest();
        }
    }

}
