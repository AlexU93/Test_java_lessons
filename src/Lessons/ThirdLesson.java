package Lessons;

import java.util.Scanner;

public class ThirdLesson {
    public static void main(String[] args) {
        // Пользовательский ввод c клавиатуры
        Scanner in = new Scanner(System.in); // Класс Scanner
        System.out.println("Введите целое число");
        int userNum = in.nextInt();
        System.out.println(userNum * userNum);

        // Цикл while выполняется с первоначальной проверкой условия

        while (true) { // Инструкция в скобках может быть любой
            System.out.println("Введите целое положительное число или 0 для выхода из программы");
            userNum = in.nextInt();
            if (userNum == 0) break; // break используется для выхода из текущего цикла if
            if (userNum < 0) continue; // переход на следующую итерацию тое есть следующее повторение цикла
            System.out.println(userNum * userNum);
        }

        // Цикл do while - первая итерация выполняется в любом случае
        do {
            System.out.println("Введите целое положительное число или 0 для выхода из программы");
            userNum = in.nextInt();
            if (userNum < 0) continue;
            System.out.println(userNum * userNum);
        } while (userNum != 0);

        int start = 1, end = 12;
        // Вывести все четные числа от start до end
        // Четное число % 2 = 0
        while (start <= end) {
            if (start %2 == 0) System.out.println(start);
            start += 1;
        }

        // Цикл for (инициализация переменных;условие булевое выражение;обновление значений переменных (счетчика))

        for (start = 1, end = 12; start <= end ; start += 1 ) {
            if (start %2 == 0) System.out.println(start);
        }

        // Вывести все неотрицательные элементы последовательности
        // 90 85 80 .... 0
        // int a = 90, b = 0;
        for (int a = 90, b = 0; a>=0; a -=5 ) {
            System.out.println(a);
        }
        // Вывести на экран первые 10 элементов последовательности
        // 2 4 6 8 10 итд
        int d = 0;
        for (int c = 2; d !=10; c += 2, d +=1) {
            System.out.println(c);
        }

        // Считать с консоли количество тарелок и моющего средства
        // Моющее средство расходуется из рассчета 0.5 на 1 тарелку
        // В цикле выводить сколько моющего средства осталось после мытья каждой тарелки
        // После цикла вывести сколько тарелок и мощего средства осталось

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите количество тарелок число");
        int plate = in.nextInt();
        System.out.println("Введите количество моющего средства");
        double thing = in.nextInt();

        while (thing > 0 && plate > 0) {
            thing = thing-(0.5*plate);
            if (thing<=0.5) break;
            plate -=1;
            System.out.println(thing);
        }
        System.out.println(plate);
        System.out.println(thing);
    }
}