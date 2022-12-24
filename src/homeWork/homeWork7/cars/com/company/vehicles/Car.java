package homeWork.homeWork7.cars.com.company.vehicles;

import homeWork.homeWork7.cars.com.company.details.Engine;
import homeWork.homeWork7.cars.com.company.professions.Driver;

/**
 * Описание свойств машины.
 *
 */
public class Car {

    /**
     * марка автомобиля
     */
    protected String brand;

    /**
     * класс автомобиля
     */
    protected String carClass;

    /**
     * вес автомобиля
     */
    protected double weight;

    /**
     * водитель автомобиля
     */
    protected Driver driver;

    /**
     * мотор автомобиля
     */
    protected Engine engine;

    public Car(String brand, String carClass, double weight) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }


    /**
     * Выводит полную информацию об автомобиле, ее водителе и моторе.
     */
    @Override
    public String toString() {
        return "\n== CAR ==\n" +
                // car
                brand + "\n" +
                carClass + "\n" +
                weight + "\n" +
                // driver
                driver.getFio() + "\n" +
                driver.getExperience() + "\n" +
                // engine
                engine.getPower() + "\n" +
                engine.getPerformance() + "\n";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


}
