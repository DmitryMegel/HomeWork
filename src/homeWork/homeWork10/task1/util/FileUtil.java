package homeWork.homeWork10.task1.util;

import homeWork.homeWork10.task1.model.Reader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    /**
     * Имя файла со списком читателей.
     */
    private static final String READERS_PATH = "readers.txt";

    /**
     * Запись списка читателей в файл.
     *
     * @param readers список читателей
     * @throws IOException Signals that an I/O exception of some sort has occurred
     */
    public static void saveReadersList(List<Reader> readers) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(READERS_PATH))){
            oos.writeObject(readers);
            oos.flush();
        } catch (Exception ex) {
            System.out.println("Ошибка записи в файл " + READERS_PATH);
            throw new IOException(ex.getMessage());
        }
    }

    /**
     * Получение списка читателей из файла.
     *
     * @return список читателей
     * @throws IOException Signals that an I/O exception of some sort has occurred
     */
    public static List<Reader> restoreReadersList() throws IOException {
        // если файла нет, считаем, что список читателей пуст
        if (!Files.exists(Path.of(READERS_PATH))) {
            return new ArrayList<>();
        }

        // читаем содержимое файла и десериализуем в лист читателей
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(READERS_PATH))){
            return (List<Reader>) ois.readObject();
        } catch (Exception ex) {
            System.err.println("Ошибка при чтении из файла " + READERS_PATH);
            throw new IOException(ex.getMessage());
        }
    }
}
