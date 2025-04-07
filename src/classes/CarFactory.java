package classes;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    private List<Car> registeredCars = new ArrayList<>();

    public List<String> carsDetails (){

        return getRegisteredCars().stream().map(car -> car.toString()).toList();
    }
    public List<Car> madeAfterSpecificYear(int year){
return getRegisteredCars().stream().filter( car -> car.getManufacturedYear() > year).toList();
    }

    public List<Car> getRegisteredCars() {
        return new ArrayList<Car>(registeredCars);
    }
    public void addCar (Car car){
        registeredCars.add(car);
    }
    public void removeCar (Car car) {
        registeredCars.remove(car);
    }
}
