package homeWork.homeWork8.exceptionTask;

import java.util.Scanner;

public class ExceptionTasks {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            String fio = scan.nextLine();
            int age = scan.nextInt();

            if (age <= 0 || age > 100) {
                throw new IncorrectInfoException("Возраст некорректен", age, fio);
            }

            if (fio.length() > 200 || fio.matches("[a-zA-Zа-яА-ЯёЁ ]")) {
                throw new IncorrectInfoException("Некорректное ФИО", age, fio);
            }

        } catch (IncorrectInfoException ex) {
            ex.printStackTrace();
        }
    }
}
