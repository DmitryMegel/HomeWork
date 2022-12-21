package homeWork.homeWork4.model;

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
    public Book[] books = new Book[10];

    /**
     * Выводим информацию о взятых книгах.
     */
    public void takeBook(Book book){

        boolean isFull = true;  // если в массиве нет места

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;

                System.out.println(fio + " взял(-а) книгу " + book.name);

                isFull = false; //тк массив еще не переполнен и добавили пользователя
                break;
            }

        }

        if (isFull) {
            System.out.println("Количество книг уже максимальное");
        }
    }

    /**
     * Выводим информацию о возврате книг.
     */
    public void returnBook(String bookName){

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && bookName.equals(books[i].name)) {
                books[i] = null;
                System.out.println(fio + " вернул(-а) книгу " + bookName);
                break;
            }

            if (i == books.length - 1) {
                System.out.println(fio + " не хранит книгу " + bookName);
            }
        }
    }

    /**
     * Выводим информацию о книгах, которые у читателя на руках.
     */
    public void printStatus(){
        int count = 0;

        StringBuilder readerBook = new StringBuilder();
        for (Book book : books) {
            if (book != null) {
                count++;
                if (count > 1) {
                    readerBook.append(", ");
                }
                readerBook.append(book.name);

            }
        }

        System.out.println(fio + " взял " + count + " книг(-у)(-и): " + readerBook);
    }
}
