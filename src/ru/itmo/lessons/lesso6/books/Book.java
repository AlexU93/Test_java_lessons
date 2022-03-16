package ru.itmo.lessons.lesso6.books;

import java.util.Objects;

public class Book {
    // Свойства
    // privare - можно обратиться только из текущего класса
    private String title; // Название
    private Author author;// Автор
    private int pageCount; // Кол-во страниц

    public Book() {} // Конструктор 1 - пустой

    public Book(Author author) { // Создали конструктор через ПКМ с помощью среды
        Objects.requireNonNull(author, "Автор не может быть Null"); // Класс предназначен для работы с объектами // Вызов метода проверки на Null
        this.author = author; // конструктор 2
    }

    public Book(String title, Author author) { // конструктор 3
        // вызвать другой конструктор
        this();
        setTitle(title);
    }

    // Создаются методы, которые позволяют установить значения свойств
    // осуществляя в них необходимые проверки - сеттеры
    // обычно ничего не возврвщают

    public void setTitle (String titleValue) { // Объявленный метод готов принять данные из вне данные типа String
        if (titleValue == null || titleValue.length() < 3) {
            throw new IllegalArgumentException("Значение title от 3-х символов"); // создание экземпляра ошибки
        }
        title = titleValue;
    }

        // Методы которые возвращают значения свойтсв - геттеры

        public String getTitle() {return title;}

        public void setPageCount(int pageCount) {
            if (pageCount < 10) {
                throw new IllegalArgumentException("Значение pageCount должно быть больше 10");
            }
            this.pageCount = pageCount; // this - ссылка на текущий объект
        }


    public int getPageCount() {
        return pageCount;
    }
}
