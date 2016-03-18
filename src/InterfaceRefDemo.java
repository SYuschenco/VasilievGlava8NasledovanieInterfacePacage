// Интерфейс:
interface Base77 {
    // Метод объявлен в интерфейсе:
    void show();
}

// Класс реализует интерфейс:
class A77 implements Base77 {
    // Описание метода интерфейса:
    public void show() {
        System.out.println("Это метод класса A!");
    }
}

// Этот класс также реализует интерфейс:
class B77 implements Base77 {
    // Описание метода интерфейса:
    public void show() {
        System.out.println("Это метод класса B!");
    }
}

public class InterfaceRefDemo {
    public static void main(String[] args) {
// Интерфейсная переменная:
        Base77 ref;
// Ссылка на объект первого класса:
        ref = new A77();
// Вызов метода через интерфейсную переменную:
        ref.show();
// Ссылка на объект второго класса:
        ref = new B77();
// Вызов того же метода через интерфейсную переменную:
        ref.show();
    }
}
