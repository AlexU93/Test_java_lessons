package FirstLesson;

public class FirstLesson {
    public static void main(String[] args) {
        int count=1;
        int count1 = 2; // инструкция с определением нескольких перменных
        long veryBig = 62_000_000_000L; // L,l указывает на явное использование типа long
        double half = 3.14; // не для большой точности
        float temp = -10.55f; // f дает указание на явное использование типа float
        count = 1000;
        half = count; // автоматическое приведение типов данных из int в double
        byte small = (byte) count; // явное приведение типов
        char symbol = 'l'; // используем одинарные кавычки;
        count1 = (int) symbol; // приведение символа к его коду в Unicode
        int a = 11;
        double b = 5;
        double c = (a / b); // деление с числом после запятой
        System.out.println (c);
        int num = 10; // оператор присваивания
        num += 10; // num=num+10
        num -= 10; // num=num-10
        // тернарный опреатор ?
        int d = 3000, f = 5000; // Если (услови 1) = true то g = d - f, иначе g = 0 аналог if else
        int g = d > f ? f - d: 0;
        System.out.println (g);


    }
}
