package homeWork.homeWork9.task1;

import homeWork.homeWork9.task1.model.Reader;

import java.util.List;
import java.util.Scanner;

/**
 * Класс с действиями над посетителем библиотеки.
 *
 * @author Mehel_DS created 11.12.2022
 */
public class LibraryOperations {

    public static void addReader(List<Reader> readers) {
        Scanner scan = new Scanner(System.in);

        Reader reader = new Reader();
        System.out.print("Введите ФИО: ");
        reader.fio = scan.nextLine();
        System.out.print("Введите факультет: ");
        reader.faculty = scan.nextLine();
        System.out.print("Введите дату рождения (пример: 01.01.2001): ");
        reader.birthday = scan.nextLine();
        System.out.print("Введите номер телефона: ");
        reader.phone = scan.nextLine();
        readers.add(reader);

        // Номер читательского билета. По идее его должна выдать библиотека
        reader.libraryCardNumber = readers.size();
        System.out.println("Читатель добавлен");
        System.out.println("Номер читательского билета: " + reader.libraryCardNumber);
    }

    public static void readerAction(List<Reader> readers, int action) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите номер читательского билета:");
        int libraryCardNumber = scan.nextInt();
        scan.nextLine();

        boolean readerIsFound = false;
        for (Reader reader : readers) {
            if (reader.libraryCardNumber == libraryCardNumber) {
                readerIsFound = true;

                switch (action) {
                    case 2:
                        reader.takeBook();
                        break;
                    case 3:
                        reader.returnBook();
                        break;
                    case 4:
                        reader.printStatus();
                        break;
                }
            }
        }

        if (!readerIsFound) {
            System.err.println("Такого пользователя нет");
        }

    }

}
