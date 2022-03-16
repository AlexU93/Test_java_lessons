package ru.itmo.lessons.lesso6;

import ru.itmo.lessons.lesso6.books.Author; // импорт класса Author
import ru.itmo.lessons.lesso6.books.Book;
import ru.itmo.lessons.lesso6.books.Shelf;

// ru.itmo.lessons.lesson.Application - полное имя класса
public class Application {
    public static void main(String[] args) {
        Author author1 = new Author(); // создали объект, экземпляр класса Author
        Author author2 = new Author(); // ТипДанных_имяОбъекта = new_имяКласса()
        // обращение к свойствам объекта осуществляется через точку
        author1.name = "Tom"; // имяОбъекта.имяСвойстваКласса = значение
        author1.surname = "Crowed";
        author2.name = "Jon";
        author2.surname = "Weak";

        // Вызов метода

        author1.printFullName(); // имяОбъекта.имяМетода ()
        author2.printFullName();

        String fullname = author1.getFullName(); // Присваеваем возращаемое значение определенное в методе
        // класс - шаблон для создания будущих объектов
        // класс - спсоб описания сущности
        // определяющий ее (сущности) состояние и поведение
        // класс - набор свойств и методов будущих объектов
        // На основе класса создаются объекты
        // (экземпляры данного класса) - представители
        // данного класса, имеющие конкретное состояние и поведение, определенное в классе
        // Перед обращением к классу его нужно импортировать

        Book book1 = new Book();
        book1.setTitle("Книга");
        System.out.println(book1.getTitle());

        Shelf shelf = new Shelf();
        shelf.addBook(book1);
        shelf.addBook(book1,book1,book1);

        // Вывод имени автора первой книги на полке
        System.out.println(shelf.books[0].author.name);


    }

}
