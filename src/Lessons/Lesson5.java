package Lessons;

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
        // char примитвный типа данных 16 битный символ Unicode
        // от 0 до 65536/ 'o0000' до '/uffff'
        char char1 = 'J'; // одинарные кавычки для одного символа // Также можно задавать код Unicode для символа
        char char2 = 74;
        char char3 = '\u0044'; // 16-ричное представление символа в escape последовательности
        System.out.print(char1);
        System.out.print(char2);
        System.out.print(char3);

        // Строки - упорядоченная последовательность символов
        // Строка - ссылочный тип
        // Являются эксзепляры класса String
        // Строки задаются через двойные кавычки
        // Через newString(); // Используются, если способ создания строки через " " невозможеи
        // Строки в Java неизменны, можно лишь создать новую строку на основе существующей

        char[] chars = {'\u004A', '\u004A', '\u0044'}; // Массив типа char
        String jjdString = new String(chars); // Преведение массива к строке
        System.out.println(Arrays.toString(chars));
        System.out.println(jjdString);
        System.out.println(jjdString.length()); // Вызов метода Length возвращающий длину строки

        char[] chars1 = {'\uD83D', '\uDC38'}; // двумя кодами представлен один символ (сурогатная пара)
        String frogString = new String(chars1); // Приведение к строке
        System.out.println(frogString);
        System.out.println(frogString.length());
        System.out.println(frogString.codePoints().count()); // Выведение количества символов

        // с версии Java 9 и выше строки стали храниться как массив byte [] + кодировка LATIN1 (1 байт) или UTF-16 (2 байта)

        // Пул строк
        // Набор уникальных строк
        // В Java для пула строк выделена отдельно память для хранения
        // Пул строк хранит только одну копию строкового литерала
        // Пример: Пул строк: "Строка" - В пул передается объект хранимый в переменной string1 и string1 хранит ссылку
        // на объект в Пуле строк
        // В пуле строк проверяется есть ли в нем данный объект и новый точно такой же не записывается

        String string1 = "Строка";
        String string2 = "Строка";
        String string3 = new String("Строка"); // при данном способе записи объект не попдает в Пул строк
        // создается новый объект и таким образом можно создавать одинаковые объекты
        // объекты хранятся в heap памяти

        String internString = string3.intern(); // Вывоз метода интернирования intern
        // возвращает ссылку на объект из Пулая строк или создает объект, помещает его в Пул строк и возвращает ссылку
        // Через == сравниваются ссылки на объект

        // Сравнение строк через метод equals

        System.out.println(string1.equals(string2)); // true если строки равны
        System.out.println("строка".equals(string2)); // false так как разные регистры буквы "С"
        System.out.println("строка".equalsIgnoreCase(string2)); // true без учета регистра
        System.out.println(string1.equals("строка")); // можно и так вариант хуже вышеприведенного

        // Проверка строки на Null

        System.out.println(string1 == null);
        System.out.println(string1 != null);

        string1 = "Java";
        string2 = "Python";

        // Конкатенация строк - "склеивание строк"

        String concatString = string1 + "::" + string2; // Вариант 1
        System.out.println(concatString);

        concatString = string1.concat(string2);// Вариант 2 через вызов метода concat()
        concatString = string1.concat(" ").concat(string2); // с пробелом
        System.out.println(concatString);

        concatString = String.join(" ", string1, string2); // Вариант 3 через метод String.join
        System.out.println(concatString);

        concatString = "";
        for (int i = 0; i < 10; i++) {
            concatString = concatString + i + " "; // Неоптимально так как при каждой иттерации создаются новые объекты строк
            System.out.println(concatString);
        }

        // Конкатинаторы
        // StringBuilder - работает быстрее не создает новые объекты
        // StringBuffer - потокобезопасный (испоьзование в многопоточных пиложениях)

        concatString = "Новая строка";
        StringBuilder sb = new StringBuilder(concatString); // В качестве параметра можно передать троку с которой начнется склейка
        sb.append(string1).append(" ").append(string2); // возвращает ссылку на результат, то есть объект StringBuilder
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb1.append(i).append(" ");
        }
        System.out.println(sb1);

        String sbString = sb1.toString(); // Возвращает строку из sb1 в sbString через метод toString
        System.out.println(sbString); // В методе println уже реализован метод toString, но не с массивами

        // Метод split ()

        String langs = "Java, Python, JavaScript";
        String [] langArr = langs.split(", "); // Параметр regex - регулярное выражение, которое ищет в строке
        // метод и создает массив
        System.out.println(Arrays.toString(langArr));

        // Метод замены

        String newString = langs.replaceAll(", ", " - "); // Замена ", " на " - " поддерживает регулярные выражеия типа условий
        System.out.println(newString);

        newString = langs.replaceFirst(", ", " - "); // Заменяет только первый заданный элемент
        System.out.println(newString);

        newString = langs.replace(", ", " - ");
        System.out.println(newString);

        System.out.println(langs.contains("pt")); // Метод проверяет содержит ли строка заданную последовательность символов

        System.out.println(langs.startsWith("j")); // Начинается ли строка с этой последовательности символов

        System.out.println(langs.endsWith("Script")); // Заканчивается ли строка этой последовательностью

        System.out.println(langs.startsWith("a", 1)); // Проверка по индексу элемента содержится ли он в строке

        String name = "Иван";
        String surname = "Петров";
        String fullname1 = name + " " + surname; // Значение высчитывается при выполнении программы
        String fullname2 = "Иван" + " " + "Петров "; // Значение уже известно программе после компиляции до выполнения программы



    }

}
