package homeWork.homeWork4;

import homeWork.homeWork4.model.Reader;
import homeWork.homeWork4.operations.LibraryOperations;

import java.util.Scanner;

/**
 * Класс отвечающий за запуск ДЗ 4.
 *
 * @author Mehel_DS created 21.12.2022
 */
public class HomeWork4 {

    /**
     * Запуск ДЗ 4.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int action;
        Reader[] readers = new Reader[10];  // максимум 10 читателей

        do {
            System.out.println(
                    "1 -- Добавить нового читателя\n" +
                            "2 -- Читатель хочет взять книгу\n" +
                            "3 -- Читатель хочет вернуть книгу\n" +
                            "4 -- Вывести статус читателя\n" +
                            "5 -- Вывести статусы всех читателей\n" +
                            "6 -- Выйти из программы");

            System.out.print("Введите номер действия: ");
            action = scan.nextInt();
            scan.nextLine();

            switch (action) {
                case 1:     // Добавить нового читателя
                    LibraryOperations.addReader(readers);
                    break;
                case 2:     // Читатель хочет взять книгу
                    LibraryOperations.takeBook(readers);
                    break;
                case 3:     // Читатель хочет вернуть книгу
                    LibraryOperations.returnBook(readers);
                    break;
                case 4:     // Вывести статус читателя
                    LibraryOperations.getReaderStatus(readers);
                    break;
                case 5:     // Вывести статусы всех читателей
                    LibraryOperations.getAllReadersStatuses(readers);
                    break;
                case 6:     // Выйти из программы
                    System.out.println("Завершаем программу");
                    break;
                default:
                    System.out.println("Нет такой команды");
            }
            // Декоративный отступ
            System.out.println();

        } while (action != 6);
    }

}
