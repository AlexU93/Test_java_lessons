package ru.itmo.lessons.lesso6.books;



public class Author {
    // свойства, характеристики класса Author
    public String name; // null не инициализирована
    // public - модификатор доступа, обращение из любой точки программы
    public String surname; // null не инициализирована

    // методы (возможности объектов, алгоритм действий)
    // void - метод после своего выполнения ничего не возвращает значит нельзя присвоить, поместить в цикл и т.д.
    public void printFullName() { // модификаторДоступа_типВозрата_имяМетода () {}
        System.out.println(name + " " + surname);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}'; // Метод вывода в консоль
    }

    public String getFullName() {
        return name + " " + surname; // return - возвращает результат работы метода  и прерывает его
        // можно использовать с методами c void - тем самым прерывая метод
        // метод возвращает данные типа стринг

    }
}

