package main;

import classes.CarFactory;
import classes.SUV;
import classes.Sedan;
import classes.SportsCar;
import exceptions.ManufacturingException;

public class Main {
    public static void main(String[] args) {
        CarFactory sergiMotors = new CarFactory();
try {
    SUV suv = new SUV("Seat", "Leon", "Petrol", 2001, "4x4");
    SportsCar sports = new SportsCar("Masseratti", "Runaway", "Diesel", 2020, 350);
    Sedan sedan = new Sedan("Opel", "Corsa", "Electric", 2015, 40);
    SUV fakeSUV = new SUV("Seat", "Leon", "Petrol", 2001, "4x4");

    System.out.println(sergiMotors.getRegisteredCars());
    System.out.println(sergiMotors.carsDetails());
    System.out.println(sergiMotors.madeAfterSpecificYear(2010));

} catch (ManufacturingException e) {
    System.out.println(e.getMessage());
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}
    }
}