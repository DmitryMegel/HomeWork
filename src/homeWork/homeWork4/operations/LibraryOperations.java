package homeWork.homeWork4.operations;

import homeWork.homeWork4.model.Book;
import homeWork.homeWork4.model.Reader;

import java.util.Scanner;

/**
 * Класс с действиями над посетителем библиотеки.
 *
 * @author Mehel_DS created 11.12.2022
 */
public class LibraryOperations {

    public static void addReader(Reader[] readers) {
        Scanner scan = new Scanner(System.in);

        boolean isFull = true;  // если в массиве нет места
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] == null) {

                Reader reader = new Reader();

                System.out.print("Введите ФИО: ");
                reader.fio = scan.nextLine();

                System.out.print("Введите факультет: ");
                reader.faculty = scan.nextLine();

                System.out.print("Введите дату рождения (пример: 01.01.2001): ");
                reader.birthday = scan.nextLine();

                System.out.print("Введите номер телефона: ");
                reader.phone = scan.nextLine();

                // вписываем читателя в reader[i]
                readers[i] = reader;

                // Номер читательского билета. По идее его должна выдать библиотека
                reader.libraryCardNumber = i + 1;
                System.out.println("Читатель добавлен");
                System.out.println("Номер читательского билета: " + reader.libraryCardNumber);

                isFull = false; //тк массив еще не переполнен и добавили пользователя
                break;
            }
        }

        if (isFull) {
            System.out.println("Количество читателей уже максимальное");
        }
    }

    public static void takeBook(Reader[] readers) {

        Scanner scan = new Scanner(System.in);

        // просим ввести номер билета
        System.out.println("Введите номер читательского билета:");
        int libraryCardNumber = scan.nextInt();
        scan.nextLine();

        boolean readerIsFound = false; // если не удалось найти пользователя
        for (int i = 0; i < readers.length - 1; i++) {
            if (readers[i] != null && readers[i].libraryCardNumber == libraryCardNumber) {
                // просим ввести данные книги
                Book book = new Book();

                System.out.print("Введите название книги: ");
                book.name = scan.nextLine();

                System.out.print("Введите автора книги: ");
                book.authorName = scan.nextLine();

                System.out.print("Введите содержание: ");
                book.text = scan.nextLine();

                // даем книгу читателю
                readers[i].takeBook(book);

                readerIsFound = true;   // тк нашли читателя с введенным номером
                break;
            }
        }

        if (!readerIsFound) {
            System.out.println("Такого пользователя нет");
        }
    }

    public static void returnBook(Reader[] readers) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите номер читательского билета:");
        int libraryCardNumber = scan.nextInt();
        scan.nextLine();

        boolean found3 = false; // если не удалось найти пользователя
        for (int i = 0; i < readers.length - 1; i++) {
            if (readers[i] != null && readers[i].libraryCardNumber == libraryCardNumber) {

                // просим ввести название книги
                System.out.println("Введите название книги:");
                String bookName = scan.nextLine();
                // берем книгу у читателя
                readers[i].returnBook(bookName);
                found3 = true;   // тк нашли читателя с введенным номером
                break;
            }
        }

        if (!found3) {
            System.out.println("Такого пользователя нет");
        }
    }

    public static void getReaderStatus(Reader[] readers) {
        Scanner scan = new Scanner(System.in);

        // просим ввести номер билета
        System.out.println("Введите номер читательского билета:");
        int libraryCardNumber = scan.nextInt();
        scan.nextLine();

        boolean found4 = false; // если не удалось найти пользователя
        for (int i = 0; i < readers.length - 1; i++) {
            if (readers[i] != null && readers[i].libraryCardNumber == libraryCardNumber) {
                // вызываем у пользователя printStatus
                readers[i].printStatus();
                found4 = true;   // тк нашли читателя с введенным номером
                break;
            }
        }

        if (!found4) {
            System.out.println("Такого пользователя нет");
        }
    }

    public static void getAllReadersStatuses(Reader[] readers) {
        int count = 0;

        for (Reader reader : readers) {
            if (reader != null) {
                reader.printStatus();
            } else {
                count++;
            }
        }

        if (count == readers.length) {
            System.out.println("Количество читателей: 0");
        }
    }
}
