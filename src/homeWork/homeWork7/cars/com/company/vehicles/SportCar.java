package homeWork.homeWork7.cars.com.company.vehicles;

/**
 * Описание свойств спорткара.
 */
public class SportCar extends Car {

    /**
     * предельная скорость
     */
    private int maxSpeed;

    public SportCar(String brand, String carClass, double weight, int maxSpeed) {
        super(brand, carClass, weight);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "\n == SPORTCAR ==\n" +
                brand + "\n" +
                carClass + "\n" +
                weight + "\n" +
                maxSpeed + "\n" +
                driver.getFio() + "\n" +
                driver.getExperience() + "\n" +
                engine.getPower() + "\n" +
                engine.getPerformance() + "\n";
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
