package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;
import ru.itmo.lessons.lesson7.base.Unit;

public class Application {
    public static void main(String[] args) {

        Knight knight1 = new Knight(20,17);
        knight1.KnightVoid();
        BattleUnit knight2 = new Knight(20,17); // В правой стороне вызываем конструктор Knight
        knight2.battleUnitVoid();
        Unit knight3 = new Knight(20,17);
        knight3.plusHealth(4);

    }
}
