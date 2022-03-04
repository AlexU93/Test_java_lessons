package Lessons;

public class SecondLesson {
    public static void main(String[] args) {
        // логические операторы
        // && - опреатор И логическое умножение
        int x = 50, y = 100, z = 91;
        boolean res = (x % 2 == 0) && (y % 2 == 0) && (z % 2 == 0);
        System.out.println(res);
        res = (x < z) && (y > z);
        System.out.println(res);

        //  || оператор ИЛИ логическое сложение
        int code = 3333, age = 34;
        res = (code == 2222) || (code == 3333) || (code == 4444);
        System.out.println(res);

        // int = 5 порядок действий: справа на лево, Java получает число и выделяет память под него в формате int по умолчанию

        // ! - логическое отрицание, не меняет значение на противоположное
        boolean isActive = false, isConnected = true;
        res = !isActive || !isConnected; // вернет true даже без проверки второго операнда, так как Java
        res = !((code != 3333) || (age < 18));

        // операторы принятия решеня - условия if смортри блокнот

        // Задача 1

        int state = 1;

        if (state == 0) {
            System.out.println("Закрытие приложения");
        } else if (state == 1) {
            System.out.println("Открытие приложения");
        } else {
            System.out.println("Ошибка доступа");
        }
    }

    // Задача 2
    {
        int month = 6;

        if ((month == 1) || (month == 2) || (month == 12)) {
            System.out.println("Зима");
        } else if ((month > 2) && (month < 5)) {
            System.out.println("Весна");
        } else if ((month > 5) && (month < 8)) {
            System.out.println("Лето");
        } else if ((month > 8) && (month < 11)) {
            System.out.println("Осень");
        } else if (month > 12) {
            System.out.println("Ошибка");
        }

    }
    int month = 5;
switch (month){
        case 1:
        case 2:
        case 12:
            break;
        System.out.println("Зима");
        case 3:
        case 4:
        case 5:
            break;
        System.out.println("Весна");
        case 6:
        case 7:
        case 8:
            break;
        System.out.println("Лето");
        case 9:
        case 10:
        case 11:
            break;
        System.out.println("Осень");
    }

}



