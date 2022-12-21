package homeWork.homeWork2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задачи по логическим операторам.
 *
 * @author Mehel_DS created 02.12.2022
 */
public class LogicalOperatorsTasks {

    /**
     * Задача 1.
     */
    public static String task1() {
        System.out.println("Введите число:");
        int n = new Scanner(System.in).nextInt();
        return (n % 2 == 0) ? "Четное" : "Нечетное";
    }

    /**
     * Задача 2.
     */
    public static void task2() {
        System.out.println("Введите числовой день недели:");
        int dayNumber = new Scanner(System.in).nextInt();

        System.out.println("\nРеализация через if-else");
        String dayName1 = "";

        if (dayNumber == 1) dayName1 = "Понедельник";
        else if (dayNumber == 2) dayName1 = "Вторник";
        else if (dayNumber == 3) dayName1 = "Среда";
        else if (dayNumber == 4) dayName1 = "Четверг";
        else if (dayNumber == 5) dayName1 = "Пятница";
        else if (dayNumber == 6) dayName1 = "Суббота";
        else if (dayNumber == 7) dayName1 = "Воскресенье";
        else dayName1 = "Такого дня нет";
        System.out.println(dayName1);


        System.out.println("\nРеализация через switch");
        String dayName2 = "";

        switch (dayNumber) {
            case 1:
                dayName2 = "Понедельник";
                break;
            case 2:
                dayName2 = "Вторник";
                break;
            case 3:
                dayName2 = "Среда";
                break;
            case 4:
                dayName2 = "Четверг";
                break;
            case 5:
                dayName2 = "Пятница";
                break;
            case 6:
                dayName2 = "Суббота";
                break;
            case 7:
                dayName2 = "Воскресенье";
                break;
            default:
                dayName2 = "Такого дня нет";
                break;
        }
        System.out.println(dayName2);
    }

    /**
     * Задача 3.
     */
    public static void task3() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();

        System.out.println("Введите третье число: ");
        int num3 = scan.nextInt();

        // если Число1 больше остальных, то делаем действия и выходим из метода, чтобы не делать лишние проверки
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) System.out.println("Ответ: " + (num1 + num2));
            else System.out.println("Ответ: " + (num1 + num3));
            return;
        }
        if (num2 > num1 && num2 > num3) {
            if (num1 > num3) System.out.println("Ответ: " + (num2 + num1));
            else System.out.println("Ответ: " + (num2 + num3));
            return;
        }
        if (num3 > num1 && num3 > num2) {
            if (num1 > num2) System.out.println("Ответ: " + (num3 + num1));
            else System.out.println("Ответ: " + (num3 + num2));
        } else {
            // если все числа одинаковые, то складываем любую пару
            System.out.println("Ответ: " + (num1 + num2));
        }

    }

    /**
     * Задача 4.
     */
    public static int task4(int year) {
        int daysCount = 365;
        if (year % 4 == 0) {
            daysCount = 366;
            if (year % 100 == 0 && year % 400 != 0){
                daysCount = 365;
            }
        }
        return daysCount;
    }

    /**
     * Задача 5.
     */
    public static void task5() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число A:");
        int a = scan.nextInt();

        System.out.println("Введите число B:");
        int b = scan.nextInt();
        if (b == 0) {
            System.out.println("Число В должно быть больше 0");
            throw new InputMismatchException();
        }

        System.out.println("Введите номер действия:\n" +
                "1 - сложение\n" +
                "2 - вычитание\n" +
                "3 - умножение\n" +
                "4 - деление");
        int action = scan.nextInt();

        switch (action) {
            case 1:
                System.out.println("Ответ: " + (a + b));
                break;
            case 2:
                System.out.println("Ответ: " + (a - b));
                break;
            case 3:
                System.out.println("Ответ: " + (a * b));
                break;
            case 4:
                System.out.println("Ответ: " + (a / b));
                break;
            default:
                System.out.println("Действие не задано");
                break;
        }

    }

    /**
     * Задача 6.
     */
    public static void task6() {

        System.out.println("Введите число в диапазоне 0-999: ");
        int num = new Scanner(System.in).nextInt();

        if (num < 0 || num > 999) {
            System.out.println("Ошибка");
        }
        int numLength = String.valueOf(num).length();

        String type = "нечетное";
        if (num % 2 == 0) {
            type = "четное";
        }

        switch (numLength) {
            case 1:
                System.out.println(type + " однозначное число");
                break;
            case 2:
                System.out.println(type + " двухзначное число");
                break;
            case 3:
                System.out.println(type + " трехзначное число");
                break;
            default:
                System.out.println("Действие не задано");
                break;
        }

    }

    /**
     * Задача 7.
     */
    public static void task7() {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Введите день (число): ");
            int dayNum = scan.nextInt();

            System.out.println("Введите месяц (число): ");
            int monthNum = scan.nextInt();


            switch (monthNum) {
                case 1:
                    if (dayNum <= 19) System.out.println("Козерог");
                    else System.out.println("Водолей");
                    break;
                case 2:
                    if (dayNum <= 18) System.out.println("Водолей");
                    else System.out.println("Рыбы");
                    break;
                case 3:
                    if (dayNum <= 20) System.out.println("Рыбы");
                    else System.out.println("Овен");
                    break;
                case 4:
                    if (dayNum <= 19) System.out.println("Овен");
                    else System.out.println("Телец");
                    break;
                case 5:
                    if (dayNum <= 20) System.out.println("Телец");
                    else System.out.println("Близнецы");
                    break;
                case 6:
                    if (dayNum <= 21) System.out.println("Близнецы");
                    else System.out.println("Рак");
                    break;
                case 7:
                    if (dayNum <= 22) System.out.println("Рак");
                    else System.out.println("Лев");
                    break;
                case 8:
                    if (dayNum <= 22) System.out.println("Лев");
                    else System.out.println("Дева");
                    break;
                case 9:
                    if (dayNum <= 22) System.out.println("Дева");
                    else System.out.println("Весы");
                    break;
                case 10:
                    if (dayNum <= 22) System.out.println("Весы");
                    else System.out.println("Скорпион");
                    break;
                case 11:
                    if (dayNum <= 22) System.out.println("Скорпион");
                    else System.out.println("Стрелец");
                    break;
                case 12:
                    if (dayNum <= 21) System.out.println("Стрелец");
                    else System.out.println("Козерог");
                    break;
                default:
                    System.out.println("Ошибка ввода. Допустимый диапазон 1-12");
                    break;
            }
        } catch (InputMismatchException ex) {
            System.out.println("Ошибка ввода");
        }
    }

    /**
     * Задача 8.
     */
    public static void task8() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер карты (1-10, 11 - валет, 12 - дама, 13 - король, 14 - туз): ");
        int gameMap = scan.nextInt();
        if (gameMap < 1 || gameMap > 14) {
            throw new InputMismatchException();
        }

        System.out.println("Введите номер масти (1 - пики, 2 - трефы, 3 - бубны, 4 - червы");
        int suit = scan.nextInt();
        if (suit < 1 || suit > 4) {
            throw new InputMismatchException();
        }

        String gameMapLiteral = "";
        switch (gameMap) {
            case 1:
                gameMapLiteral = "единица";
                break;
            case 2:
                gameMapLiteral = "двойка";
                break;
            case 3:
                gameMapLiteral = "тройка";
                break;
            case 4:
                gameMapLiteral = "четверка";
                break;
            case 5:
                gameMapLiteral = "пятерка";
                break;
            case 6:
                gameMapLiteral = "шестрека";
                break;
            case 7:
                gameMapLiteral = "семерка";
                break;
            case 8:
                gameMapLiteral = "восьмерка";
                break;
            case 9:
                gameMapLiteral = "девятка";
                break;
            case 10:
                gameMapLiteral = "десятка";
                break;
            case 11:
                gameMapLiteral = "валет";
                break;
            case 12:
                gameMapLiteral = "дама";
                break;
            case 13:
                gameMapLiteral = "король";
                break;
            case 14:
                gameMapLiteral = "туз";
                break;
            default:
                System.out.println("Ошибка ввода");
                return;
        }

        String suitLiteral = "";
        switch (suit) {
            case 1:
                suitLiteral = "пик";
                break;
            case 2:
                suitLiteral = "треф";
                break;
            case 3:
                suitLiteral = "бубен";
                break;
            case 4:
                suitLiteral = "червей";
                break;
            default:
                System.out.println("Ошибка ввода");
                return;
        }

        System.out.println(gameMapLiteral + " " + suitLiteral);
    }

}

