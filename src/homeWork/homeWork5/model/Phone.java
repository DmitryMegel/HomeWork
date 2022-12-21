package homeWork.homeWork5.model;

import java.util.Arrays;

/**
 * Данные о телефоне.
 *
 * @author Mehel_DS created 17.12.2022
 */
public class Phone {

    /**
     * Номер
     */
    private int number;

    /**
     * Модель
     */
    private String model;

    /**
     * Вес
     */
    private double weight;

    public Phone() {
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    /**
     * Возвращает информацию о вызове.
     *
     * @param callerName имя звонящего
     * @return информация о вызове
     */
    public String receiveCall(String callerName) {
        return "Звонит " + callerName;
    }

    /**
     * Возвращает информацию о вызове.
     *
     * @param callerName имя звонящего
     * @param callerNumber номер звонящего
     * @return информация о вызове
     */
    public static String receiveCall(String callerName, int callerNumber) {
        return "Звонит " + callerName + ", тел. " + callerNumber;
    }

    /**
     * Выводит на экран номера телефонов, которым будет отправлено сообщение.
     *
     * @param numbers номера телефонов
     */
    public static void sendMessage(int... numbers) {
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
