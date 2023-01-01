package homeWork.homeWork8;

public class StringTasks {

    public static void main(String[] args) {
        System.out.println(task1(399, 56));
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
}
