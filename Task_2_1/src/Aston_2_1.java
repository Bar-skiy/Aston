import java.util.Scanner;

public class Aston_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух чисел
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Выполнение арифметических операций
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));

        // Проверка на деление на ноль
        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление: Ошибка (деление на ноль)");
        }

        scanner.close();
    }
}
