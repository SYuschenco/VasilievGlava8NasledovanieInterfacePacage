// Суперкласс:
class Base1 {
    // Текстовое поле суперкласса:
    String name;

    // Конструктор суперкласса:
    Base1(String name) {
        this.name = name;
    }

    // Метод для отображения значения поля:
    void show() {
        System.out.println("Объект суперкласса: " + name);
    }

    // Метод выводит приветствие:
    void sayHello() {
        System.out.println("Всем привет!");
    }
}

// Подкласс:
class SubBase1 extends Base1 {
    // Символьное поле подкласса:
    char code;

    // Конструктор подкласса:
    SubBase1(String name, char code) {
        super(name);
        this.code = code;
    }

    // Переопределение метода:
    void show() {
        System.out.println("Объект подкласса: " + name + ". Код: " + code);
    }
}

public class SubRefDemo {
    public static void main(String[] args) {
// Объектная переменная суперкласса:
        Base1 obj1;
// Ссылка на объект суперкласса:
        obj1 = new Base1("Базовый");
// Обращение к методам объекта суперкласса:
        obj1.sayHello();
        obj1.show();
// Ссылка на объект подкласса:
        SubBase1 obj = new SubBase1("Производный", 'A');
// Обращение к методам объекта подкласса:
        obj.sayHello();
        obj.show();
    }
}
