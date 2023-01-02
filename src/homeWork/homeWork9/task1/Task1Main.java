package homeWork.homeWork9.task1;

import homeWork.homeWork9.task1.model.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Reader> readers = new ArrayList<>();

        int action;
        do {
            System.out.println(
                    "1 -- Добавить нового читателя\n" +
                    "2 -- Читатель хочет взять книгу\n" +
                    "3 -- Читатель хочет вернуть книгу\n" +
                    "4 -- Вывести статус читателя\n" +
                    "5 -- Вывести статусы всех читателей\n" +
                    "6 -- Выйти из программы");

            System.out.println("Введите номер действия: ");
            action = scan.nextInt();
            scan.nextLine();

            switch (action) {
                case 1:     // Добавить нового читателя
                    if (readers.size() >= 10) {
                        System.err.println("Количество читателей уже максимальное");
                        return;
                    }
                    LibraryOperations.addReader(readers);
                    break;
                case 2:     // Читатель хочет взять книгу
                case 3:     // Читатель хочет вернуть книгу
                case 4:     // Вывести статус читателя
                    LibraryOperations.readerAction(readers, action);
                    break;
                case 5:     // Вывести статусы всех читателей
                    if (readers.isEmpty()) {
                        System.err.println("Количество читателей: 0");
                        break;
                    }
                    readers.forEach(Reader::printStatus);
                    break;
                case 6:     // Выйти из программы
                    System.out.println("Завершаем программу");
                    break;
                default:
                    System.err.println("Нет такой команды");
            }
            // Декоративный отступ
            System.out.println();

        } while (action != 6);
    }
}
