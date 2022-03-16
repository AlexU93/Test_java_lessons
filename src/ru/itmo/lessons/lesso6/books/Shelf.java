package ru.itmo.lessons.lesso6.books;

public class Shelf {
    private String color = "белые"; // цвет полки // сразу задали и изменить из Application не можем так как не написан геттер

    private Book[] books = new Book[10]; // книги // задали ограничение в 10-ть книг // тип данных Book

    public void addBook(Book book){ // Метод добавления книги на полку
        for (int i =1; i < books.length ; i++) {
            if (books[i] == null) {
                books[i] = book;
                return; // заверщаем метод
            }
        }
        System.out.println("Нет места на полке");
    }

    // Метод добавления нескольких книг на полку

    public void addBook (Book...books) { // Перегруженный метод с точно таким же названием но выполняет другую инструкцию
        // Троеточие показывает что метод принимает на вход переменное количество перменных
        // Из перменных book1, book1, book1 создается массив и ссылка на него передается Book
        // ... спред оператор


    }
}
