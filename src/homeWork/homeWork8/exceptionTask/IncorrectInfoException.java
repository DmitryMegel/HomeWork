package homeWork.homeWork8.exceptionTask;

public class IncorrectInfoException extends Exception {
    private int age;
    private String fio;

    public IncorrectInfoException(String message, int age, String fio) {
        super(message);
        this.age = age;
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
