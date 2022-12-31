package homeWork.homeWork7.cars.com.company;

import homeWork.homeWork7.cars.com.company.details.Engine;
import homeWork.homeWork7.cars.com.company.professions.Driver;
import homeWork.homeWork7.cars.com.company.vehicles.Car;
import homeWork.homeWork7.cars.com.company.vehicles.Lorry;
import homeWork.homeWork7.cars.com.company.vehicles.SportCar;

public class CarsMain {

    public static void main(String[] args) {

        // Машина
        Car car = new Car("LADA", "VESTA CROSS", 1.6);
        car.setDriver(new Driver("Мегель Д. С.", 10));
        car.setEngine(new Engine(106, 80));

        System.out.println(car);
        car.start();
        car.stop();
        car.turnRight();
        car.turnLeft();


        // Грузовик
        Lorry lorry = new Lorry("Volvo", "Truck", 10, 9);
        lorry.setDriver(new Driver("Иванов И. И.", 30));
        lorry.setEngine(new Engine(300, 70));

        System.out.println(lorry);
        lorry.start();
        lorry.stop();
        lorry.turnRight();
        lorry.turnLeft();

        // Спорткар
        SportCar sportCar = new SportCar("Ford", "GT", 1.3, 300);
        sportCar.setDriver(new Driver("Петров П. Р.", 15));
        sportCar.setEngine(new Engine(500, 95));

        System.out.println(sportCar);
        sportCar.start();
        sportCar.stop();
        sportCar.turnRight();
        sportCar.turnLeft();
    }
}
