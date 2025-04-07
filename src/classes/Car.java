package classes;

import exceptions.ManufacturingException;

public abstract class Car {
    private String brand;
    private String model;
    private String engine;
    private int manufacturedYear;

    public abstract void description();

    public Car(String brand, String model, String engine, int manufacturedYear) {
        validation(brand, model, engine, manufacturedYear);
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.manufacturedYear = manufacturedYear;
    }
    private void validation (String brand, String model, String engine, int manufacturedYear ) {
        if (validator(brand) | validator(model) | validator(engine)) {
            throw new IllegalArgumentException("Brand, model and engine must not be empty or null");
        }

        if (manufacturedYear < 2010){
            throw new ManufacturingException();
        }

    }
    private boolean validator (String attribute){
        return attribute.isEmpty() | attribute == null;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", manufacturedYear=" + manufacturedYear +
                '}';
    }
}

