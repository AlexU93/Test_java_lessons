package ru.itmo.lessons.lesson9;

public class Application {


    public static void main(String[] args) {
        Point a = new Point(23, -12);
        Point b = new Point(23, -12);

        System.out.println(a);
        System.out.println(b);

        // сравнение ссылок
        System.out.println(a == b); // false
        // по умолчанию метод equals сравнивает ссылки
        // и должен быть переопределен в классе
        System.out.println(a.equals(b)); // false
        // клонирование
        // по умолчанию у метода clone protected
        Point aClone = a.clone(); // true так как переопределен метод в Point



    }

}