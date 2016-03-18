// Суперкласс:
class C {
    int first;

    // Метод для присваивания значения
// полю без аргумента:
    void set() {
        first = 0;
        System.out.println("Нулевое значение поля.");
    }

    // Метод для присваивания значения
// полю с одним аргументом:
    void set(int n) {
        first = n;
// Вызов метода для отображения поля:
        show();
    }

    // Метод для отображения поля:
    void show() {
        System.out.println("Поле " + first + ".");
    }

    void showAll() {
        System.out.println("Все поля - на экран!");
        show();
    }
}

// Подкласс:
class D extends C {
    // Еще одно поле:
    int second;

    // Переопределение варианта метода с одним аргументом:
    void set(int n) {
        first = n;
        second = n;
// Вызов переопределенного метода:
        show();
    }

    // Перегрузка метода:
    void set(int m, int n) {
        second = n;
// Вызов варианта метода из суперкласса:
        super.set(m);
    }

    // Переопределение метода для отображения полей:
    void show() {
        System.out.println("Поля " + first + " и " + second + ".");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
// Объект суперкласса:
        C objC = new C();
// Методы суперкласса:
        objC.set();
        objC.set(100);
// Объект подкласса:
        D objD = new D();
// Методы подкласса:
        objD.set();
        objD.second = -1;
        objD.show();
        objD.set(200);
        objD.set(1, 2);
// Метод showAll():
        objC.showAll();
        objD.showAll();
    }
}