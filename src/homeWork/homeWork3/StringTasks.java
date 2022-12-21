package homeWork.homeWork3;

import java.util.Scanner;

/**
 * Задачи по строкам.
 *
 * @author Mehel_DS created 04.12.2022
 */
public class StringTasks {

    /**
     * Задача 1.
     */
    public static void task1() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите текст: ");
        String text = scan.nextLine();
        System.out.println("Введите символ: ");
        String symbol = scan.nextLine();

        char s = symbol.charAt(0);
        char[] strArray = text.toCharArray();

        int count = 0;
        for (char sa : strArray) {
            if (s == sa) {
                count++;
            }
        }
        System.out.println("Результат: " + count);
    }

    /**
     * Задача 2.
     */
    public static void task2() {
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String text = scan.nextLine();

            if (text.isEmpty()) {
                System.out.println("Ошибка ввода. Попробуйте снова.");
                continue;
            }

            System.out.println("Введите символ, который нужно найти в строке: ");
            String a = scan.nextLine();
            System.out.println("Введите символ, на который будем менять: ");
            String b = scan.nextLine();

            System.out.println("Результат: " + text.replace(a, b));
            break;
        }
    }
}
