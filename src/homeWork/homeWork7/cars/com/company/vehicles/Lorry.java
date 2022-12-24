package homeWork.homeWork7.cars.com.company.vehicles;

/**
 * Описание свойств грузовика.
 */
public class Lorry extends Car {

    /**
     * грузоподъемность кузова
     */
    private int bearingCapacity;

    public Lorry(String brand, String carClass, double weight, int bearingCapacity) {
        super(brand, carClass, weight);
        this.bearingCapacity = bearingCapacity;
    }
    @Override
    public String toString() {
        return "\n== LORRY ==\n" +
                brand + "\n" +
                carClass + "\n" +
                weight + "\n" +
                bearingCapacity + "\n" +
                driver.getFio() + "\n" +
                driver.getExperience() + "\n" +
                engine.getPower() + "\n" +
                engine.getPerformance() + "\n";
    }

    public int getBearingCapacity() {
        return bearingCapacity;
    }

    public void setBearingCapacity(int bearingCapacity) {
        this.bearingCapacity = bearingCapacity;
    }
}
