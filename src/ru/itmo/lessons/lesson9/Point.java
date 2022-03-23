package ru.itmo.lessons.lesson9;

import java.util.Objects;

// все классы в языке наследуются от класса Object
// implements Cloneable необходим, если происходит вызов метода
// clone родителя - Object то есть super.clone()
public class Point implements Cloneable {// в одном файле только один public класс
    private int x;
    private int y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString () {
        return "Point{" + "x=" + x +", y=" + y +'}';
    }

    @Override
    public boolean equals(Object o) { // Передается объект типа Object //
        // и создается объект для работы с этим методом - типа Object
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; // Проверка ссылок на один и тот же класс
        Point point = (Point) o; // приведение объекта к типу Point
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    public Point clone () { // Переопределяем метод clone класса Object
        try {
            return (Point) super.clone(); // вызываем метод родителя, то есть метод clone класса Object
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

    }
}



