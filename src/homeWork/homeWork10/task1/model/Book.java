package homeWork.homeWork10.task1.model;

import java.io.Serializable;

/**
 * Класс с описанием книг.
 *
 * @author Mehel_DS created 11.12.2022
 */
public class Book implements Serializable {

    /**
     * Название книги
     */
    public String name;

    /**
     * Имя автора
     */
    public String authorName;

    /**
     * Содержание
     */
    public String text = "";

}
