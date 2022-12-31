package homeWork.homeWork2;

/**
 * Задачи по циклам.
 *
 * @author Mehel_DS created 03.12.2022
 */
public class CycleTasks {

    public static void main(String[] args) {
        task1(5);
    }

    /**
     * Задача 1.
     */
    public static void task1(int num) {
        int i = 1;
        while (i <= num) {
            System.out.println("Task" + i);
            i++;
        }
    }

    /**
     * Задача 2.
     */
    public static void task2() {
        int i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }

    /**
     * Задача 3.
     */
    public static void task3(int num) {
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        System.out.println(result);
    }

    /**
     * Задача 4.
     */
    public static void task4(int a, int b) {
        if (a >= b) {
            System.out.println("Ошибка: a должно быть меньше b");
            return;
        }

        int n = 0;
        for (int i = b - 1; i > a; i--) {
            System.out.println(i);
            n++;
        }

        System.out.println("Кол-во: " + n);
    }

    /**
     * Задача 5.
     *
     * @param a длина отрезка A
     * @param b длина отрезка B
     */
    public static void task5(int a, int b) {
        if (a <= b || a <= 0 || b <= 0) {
            System.out.println("Ошибка стартовых значений");
            return;
        }

        int count = 0;
        for(int i = b; i <= a; i += b) {
            count += b;
        }

        System.out.println(a - count);
    }

    /**
     * Задача 6.
     *
     * @param a длина
     * @param b ширина
     * @param c сторона квадрата
     */
    public static void task6(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ошибка стартовых значений");
            return;
        }

        // сторона квадрата не должна быть больше ширины
        if (c > b) {
            System.out.println("сторона квадрата не должна быть больше ширины");
            return;
        }
        int squareCount = 0;
        for(int i = c; i <= a; i += c) {
            squareCount++;
        }

        int squareCountInColumn = b / c;
        squareCount *= squareCountInColumn;
        System.out.println(squareCount);
    }

    /**
     * Задача 7.
     */
    public static void task7(int n) {
        // Стартовое число
        System.out.println("Число: " + n + "\n");

        // число должно быть больше 0
        if (n <= 0) {
            System.out.println("Ошибка стартовых значений");
            return;
        }

        // инициализация
        int len = 0;    // кол-во цифр
        int sum = 0;    // сумма цифр
        int nReverse = 0;   // число наоборот
        boolean isTwoExists = false;    // есть ли двойка

        // Кол-во циклов равно кол-ву цифр
        while (n > 0){
            len++;

            int digit = n % 10;
            if (digit == 2) isTwoExists = true;
            sum += digit;
            nReverse = (nReverse * 10) + digit;
            n /= 10;

        }
        System.out.println("Число наоборот: " + nReverse);
        System.out.println("Кол-во цифр: " + len);
        System.out.println("Сумма цифр: " + sum);
        if (isTwoExists) {
            System.out.println("двойка есть");
        } else {
            System.out.println("двойки нет");
        }
    }

    /**
     * Задача 8.
     */
    public static void task8(float contribution,  float procent) {
        float p = procent / 100;

        if (procent < 0f || procent > 25f) {
            System.out.println("Ошибка стартовых значений");
            return;
        }

        int monthCount = 0;
        float sum = contribution;

        while (contribution <= 1100f) {
            monthCount++;
            contribution += contribution * p;
            sum += contribution;
        }

        System.out.println("Через " + monthCount + " месяц(-ев) размер вклада превысит 1100 руб.");
        System.out.println("Размер вклада составит: " + contribution);
        System.out.println("Сумма на счете составит: " + sum);
    }
}
