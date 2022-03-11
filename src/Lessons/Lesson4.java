package Lessons;

import java.util.Arrays;

public class Lesson4 {
    // Массивы одномерные
    public static void main(String[] args) {
        int[] ints1 = new int[7]; // Объявление массива = создание массива
        System.out.println(Arrays.toString(ints1)); // Вывод массива в консоль
        int[] ints2 = {6, 9, 10, 3, 5, 11}; // Объявление и создание массива с необходимыми данными
        System.out.println(Arrays.toString(ints2)); // Вывод массива в консоль
        ints2 = new int[3]; // Присвоение массива к новой переменной, ссылка на новый массив
        System.out.println(Arrays.toString(ints2));
        ints2 = new int[]{9, 5, 6};// Ссылка на массив с хранящимеся в нем данными
        System.out.println(Arrays.toString(ints2));

        // Длина массива

        int len = 8;
        int[] ints3 = new int[len]; // Задание длины массива
        int[] ints4 = new int[len + 5]; // Задание длины массива // в скобки можно прописать метод Math.random приведенный к int
        System.out.println(Arrays.toString(ints4));
        System.out.println(ints4.length); // длина массива через вызов массива как объекта

        // Доступ к элементам массива

        System.out.println(ints4[3]); // название массива[индекс элемента]
        ints4[5] = 77; // Присвоение данных элементу массива
        System.out.println(Arrays.toString(ints4));


        // Многомерные массивы

        int[][] ints5 = new int[3][3]; // имя [кол-во вложенных массивов] [длина внутреннего массива] //[[0,0,0],[0,0,0],[0,0,0]]

        // Вывод многомерного массива
        System.out.println(Arrays.deepToString(ints5));

        // [[0,0] [0,0,0] [0,0,0,0]]
        int[][] ints6 = new int[3][];
        ints6[0] = new int[2]; // имя[порядковый номер вложенного массива] = new int [длина вложенного массива]
        ints6[1] = new int[3];
        ints6[2] = new int[4];
        System.out.println(Arrays.deepToString(ints6));

        // Перебор массива

        // for
        int[] ints7 = {1, 1, 1, 1, 1};
        int sum = 0;
        for (int index = 0; index < ints7.length; index += 1) {
            ints7[index] *= ints7[index];
            sum = sum + ints7[index];
        }
        System.out.println(sum);

        // foreach () {}

        sum = 0;
        // Не предоставляет доступа к индексам
        // Не дает возможности изменить значения элементов массива
        // сам определяет длину массива
        // работает от первого элемента к последнему
        // element - значение элемента массива
        for (int element : ints7) {
            System.out.println(element);
            sum += element;
        }
            // Найти и вывести в консоль минимальное значение элемента массива ints8

        double[] ints8 = {3.7, -6.2, 12.9, 0.4, 4.1};


        // Вывести случайный элемент массива ints8
        System.out.println(ints8[(int)Math.random()* ints8.length]);

        // Метод sort
        Arrays.sort(ints8);
        System.out.println(Arrays.toString(ints8));

        // Метод бинарного поиска
        // Если возвращаемое значение <0 то елемент в массиве не найден
        // Работает с отсортированным массивом

        int element = Arrays.binarySearch(ints8, 4);
        System.out.println(element);

        double [] ints9 = {3.7, -6.2, 12.9, 0.4, 4.1};
        double [] ints10 = ints9; // Ссылка ints10 на ints9 не создание копии массива!
        double [] cloneInts9 = ints9.clone(); // Вызов метода clone копируемого массива

        double[] copyInts9 = Arrays.copyOf(ints9, 3); // в newLength (длина массива) можно передавать выражения типа int

        double [] ints9copy = new double[10];
        System.arraycopy(ints9, 1, ints9copy, 0, 4);
        System.out.println(Arrays.toString(ints9copy));

        // Алгоритм быстрой сортировки
    }
}
