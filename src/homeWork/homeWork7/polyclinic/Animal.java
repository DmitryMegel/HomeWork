package homeWork.homeWork7.polyclinic;

public abstract class Animal {

    /**
     * кличка питомца
     */
    private String name;

    /**
     * возраст питомца
     */
    private int age;

    public abstract void makeNoise();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
