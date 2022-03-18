package ru.itmo.lessons.lesson7.base;
// Наследование классом BattleUnit класса Unit (родительский класс)
// множественное наследование классов запрщенно, после extends стоит одно название класса
// наследуются методы и свойтсва(переменные) родительского класса
// Конструкторы не наследуются
abstract public class BattleUnit extends Unit {
    protected int attackScore;

    public BattleUnit(int healthScore, int attackScore){ // Конструктор
        super(healthScore); // вызов конструктора родителя // значение передается как только он завершиться в род-ом классе
        if (attackScore < 1) {
            throw new IllegalArgumentException("Атака должна быть положительной");
        }
        this.attackScore = attackScore;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void battleUnitVoid () {
        System.out.println("Метод BattleUnit");
    }



}
