package homeWork.homeWork9.task1.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Класс с информацией о пользователе библиотеки.
 *
 * @author Mehel_DS created 11.12.2022
 */
public class Reader {

    /**
     * ФИО пользователя
     */
    public String fio;

    /**
     * Номер читательского билета
     */
    public int libraryCardNumber;

    /**
     * Факультет
     */
    public String faculty;

    /**
     * Дата рождения
     */
    public String birthday;

    /**
     * Телефон
     */
    public String phone;

    /**
     * Список взятых книг
     */
    public List<Book> books = new LinkedList<>();

    /**
     * Выводим информацию о взятых книгах.
     */
    public void takeBook(){
        if (books.size() >= 10) {
            System.err.println("Количество книг уже максимальное");
            return;
        }

        Scanner scan = new Scanner(System.in);

        // просим ввести данные книги
        Book book = new Book();
        System.out.print("Введите название книги: ");
        book.name = scan.nextLine();
        System.out.print("Введите автора книги: ");
        book.authorName = scan.nextLine();
        System.out.print("Введите содержание: ");
        book.text = scan.nextLine();

        books.add(book);
        System.out.println(fio + " взял(-а) книгу " + book.name);

    }

    /**
     * Выводим информацию о возврате книг.
     */
    public void returnBook(){
        Scanner scan = new Scanner(System.in);

        // просим ввести название книги
        System.out.println("Введите название книги:");
        String bookName = scan.nextLine();

        boolean isExistBook = false;
        for(Book book : books) {
            if (bookName.equals(book.name)) {
                isExistBook = true;
                System.out.println(fio + " вернул(-а) книгу " + bookName);
                books.remove(book);
                break;
            }
        }

        if (!isExistBook) {
            System.out.println(fio + " не хранит книгу " + bookName);
        }

    }

    /**
     * Выводим информацию о книгах, которые у читателя на руках.
     */
    public void printStatus(){
        int count = 0;

        StringBuilder readerBook = new StringBuilder();
        for (Book book : books) {
                count++;
                if (count > 1) {
                    readerBook.append(", ");
                }
                readerBook.append(book.name);
        }

        System.out.println(fio + " взял " + count + " книг(-у)(-и): " + readerBook);
    }
}
