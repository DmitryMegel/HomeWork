package homeWork.homeWork7.instruments;

public class Tuba implements Instrument {

    private int diameter;

    public Tuba(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет туба. Диаметр: " + diameter);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
