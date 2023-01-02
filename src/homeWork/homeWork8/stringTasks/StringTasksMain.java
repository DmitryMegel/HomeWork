package homeWork.homeWork8.stringTasks;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTasksMain {

    public static void main(String[] args) {
        // Для вызова - раскомментировать
        // System.out.println(task1(399, 56));
        // System.out.println(task2());
        // task3();
        // task4();
        // System.out.println(task5());
    }

    private static String task1(int num1, int num2) {
        // sb.replace(9, 10, "равно") сработает правильно только при условии, что на этом месте будет "=".
        // Т.к. у меня строка формируется вся сразу, мне нужно прописать три раза replace,
        // точно определив положение символов "=".
        // А если числа num1 и num2 будут больше/меньше, это приведет к неправильной замене символов.
        // Поэтому сделал автозамену после преобразования в строку.

        return new StringBuilder()
                .append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2).append("\n")
                .append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2).append("\n")
                .append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2)
                .toString()
                .replace("=", "равно");
    }

    private static boolean task2() {

        Pattern pattern = Pattern.compile("^(https?:\\/\\/)?([\\w-]{1,32}\\.com)[^\\s@]*$");
        Matcher matcher = pattern.matcher(new Scanner(System.in).nextLine());
        return matcher.matches();
    }

    private static void task3() {
        List<String> list = List.of("ahb acb aeb aeeb adcb axeb".split(" "));

        Pattern pattern = Pattern.compile("(^a.b$)");
        Matcher matcher;

        for(String s : list) {
            matcher = pattern.matcher(s);
            if (matcher.matches()) {
                System.out.println(s);
            }
        }
    }

    private static void task4() {
        List<String> list = List.of("ab abab abab abababab abea dfd".split(" "));

        Pattern pattern = Pattern.compile("ab+|ab.+");
        Matcher matcher;

        for (String s : list) {
            matcher = pattern.matcher(s);
            if (matcher.matches()) {
                System.out.println(s);
            }
        }
    }

    private static String task5() {
        Scanner scan = new Scanner(System.in);

        // 2012/09/30
        String date = scan.nextLine();

        if (date.length() > 4 &&
                (Integer.parseInt(date.substring(0, 4)) >= 1000 || Integer.parseInt(date.substring(0, 4)) <= 2012)) {
            Pattern pattern = Pattern.compile("([12][0-9][0-9][0-9])/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])");
            Matcher matcher = pattern.matcher(date);

            return matcher.matches() ? date + " - cуществует" : date + " - не cуществует";
        } else {
            return date + " не входит в диапазон допустимых дат";
        }

    }
}
