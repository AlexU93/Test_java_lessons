package ru.itmo.lessons.lesson7.base;

public interface AttackAble { // содержат методы без реализации
    void attack (BattleUnit enemy); // Всегда public // можно атаковать только боевых юнитов
    // метод с реализацией, если он типа default
    default  void someVoid () {
        System.out.println("Метод с реализацией");
    }
}
