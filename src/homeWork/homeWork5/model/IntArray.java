package homeWork.homeWork5.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Класс-оболочка для массива чисел.
 *
 * @author Mehel_DS created 17.12.2022
 */
public class IntArray {

    /**
     * Массив чисел
     */
    private int[] numbers;

    public IntArray() {
        numbers = createRandomIntArray(10);
    }

    public IntArray(int arrayLength) {
        numbers = createRandomIntArray(arrayLength);
    }

    public IntArray(int[] array) {
        numbers = array;
    }


    /**
     * Выполняет сортировку по возрасстанию/убыванию.
     *
     * @param number число для определения типа сортировки
     * @return сортированный массив
     */
    public int[] sort(int number) {
        if (number <= 0) {
            // по убыванию
            numbers = Arrays.stream(numbers)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
        } else {
            // по возрасстанию
            Arrays.sort(numbers);
        }

        return numbers;
    }

    /**
     * Возвращает массив из случайных чисел от 1 до 100.
     *
     * @param arrayLength размер массива
     * @return массив из случайных чисел от 1 до 100
     */
    public static int[] createRandomIntArray(int arrayLength) {
        return new Random()
                .ints(1, 100)
                .limit(arrayLength)
                .toArray();
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
