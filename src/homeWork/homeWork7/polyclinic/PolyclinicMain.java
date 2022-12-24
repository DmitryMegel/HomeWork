package homeWork.homeWork7.polyclinic;

public class PolyclinicMain {

    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal rat = new Rat();

        cat.makeNoise();
        dog.makeNoise();
        rat.makeNoise();
        /* результат в консоли:
            Мяу
            Гав
            Пи
        */
    }
}
