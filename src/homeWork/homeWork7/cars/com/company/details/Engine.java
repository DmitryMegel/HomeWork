package homeWork.homeWork7.cars.com.company.details;

public class Engine {

    /**
     * мощность
     */
    private int power;

    /**
     * производительность
     */
    private int performance;

    public Engine(int power, int performance) {
        this.power = power;
        this.performance = performance;
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }
}
