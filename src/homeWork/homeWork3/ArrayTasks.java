package homeWork.homeWork3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задачи по массивам.
 *
 * @author Mehel_DS create 03.12.2022
 */
public class ArrayTasks {

    /**
     * Задача 1.
     */
    public static void task1() {
        int min = 10;
        int max = 99;

        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random() * (max - min)) + min);
        }

        String result = "";
        for (int a : array) {
            result = result.concat(String.valueOf(a)).concat(" ");
        }
        System.out.println("Массив в строку: " + result);

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i] <= array[i-1]) {
                    System.out.println("Массив не является строго возрастающей последовательностью");
                    return;
                }
            }
        }

        System.out.println("Массив является строго возрастающей последовательностью");
    }

    /**
     * Задача 2.
     */
    public static void task2() {

        while(true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите размер массива: ");
                int arrayLength = scan.nextInt();
                if (arrayLength < 1) {
                    throw new InputMismatchException();
                }

                System.out.println("Введите минимальное число для рандомайзера");
                int randomMin = scan.nextInt();

                System.out.println("Введите максимальное число для рандомайзера");
                int randomMax = scan.nextInt();
                if (randomMax < randomMin) {
                    throw new InputMismatchException();
                }

                int[] array = new int[arrayLength];
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int)((Math.random() * (randomMax - randomMin)) + randomMin);
                    System.out.println(array[i]);
                }
                break;

            } catch (InputMismatchException ex) {
                System.out.println("Ошибка ввода");
            }
        }
    }

    /**
     * Задача 3.
     */
    public static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scan.nextInt();
        System.out.println("Рандом. MIN: ");
        int a = scan.nextInt();
        System.out.println("Рандом. MAX: ");
        int b = scan.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random() * (b - a)) + a);
        }

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(i > 0) {
                if (array[i] > array[i-1]) index = i;
            }
        }
        System.out.println("Индекс максимального элемента: " + index + ": Значение: " + array[index]);
    }

    /**
     * Задача 4.
     */
    public static void task4() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scan.nextInt();
        System.out.println("Рандом. MIN: ");
        int a = scan.nextInt();
        System.out.println("Рандом. MAX: ");
        int b = scan.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random() * (b - a)) + a);
        }

        System.out.println(Arrays.toString(array));

        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    isSorted = false;

                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * Задача 5.
     */
    public static void task5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Рандом. MIN: ");
        int a = scan.nextInt();
        System.out.println("Рандом. MAX: ");
        int b = scan.nextInt();

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random() * (b - a)) + a);
        }

        System.out.println(Arrays.toString(array));

        System.out.println("Введите число: ");
        int n = scan.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.println("Число " + n + " есть в массиве. Индекс: " + i);
                return;
            }
        }
        System.out.println("Числа " + n + " нет в массиве.");
    }

    /**
     * Задача 6.
     */
    public static void task6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scan.nextInt();
        System.out.println("Рандом. MIN: ");
        int a = scan.nextInt();
        System.out.println("Рандом. MAX: ");
        int b = scan.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random() * (b - a)) + a);
        }

        System.out.println(Arrays.toString(array));

        int iRev = 0;
        int[] arrayReversed = new int[4];
        for (int i = array.length-1; i >= 0; i--) {
            arrayReversed[iRev] = array[i];
            iRev++;
        }
        System.out.println(Arrays.toString(arrayReversed));
    }

    /**
     * Задача 7.
     */
    public static void task7() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scan.nextInt();
        System.out.println("Рандом. MIN: ");
        int a = scan.nextInt();
        System.out.println("Рандом. MAX: ");
        int b = scan.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random() * (b - a)) + a);
        }

        System.out.println(Arrays.toString(array));

        System.out.println("Введите число: ");
        int k = scan.nextInt();

        // Линейный поиск
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                System.out.println("Индекс элемента: " + k);
                System.out.println("Линейный поиск: " + (i + 1) + " шаг(-а)(-ов)");
                break;
            }
        }

        // Двоичный поиск
        int count = 1;
        int iFirst = 0;
        int iLast = array.length - 1;

        while (iFirst <= iLast) {
            int iMiddle = (iFirst + iLast) / 2;

            if (array[iMiddle] == k) {
                System.out.println("Двоичный поиск: " + count + " шаг(-а)(-ов)");
                return;
            } else if (array[iMiddle] < k) {
                iFirst = iMiddle + 1;
            } else if (array[iMiddle] > k) {
                iLast = iMiddle - 1;
            }

            count++;
        }
        System.out.println("Значения " + k + " нет в массиве");
    }
}
