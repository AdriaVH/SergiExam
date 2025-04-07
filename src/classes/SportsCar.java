package classes;

import interfaces.Exportable;

public class SportsCar extends Car implements Exportable {
    private float maxSpeed;

    public SportsCar(String brand, String model, String engine, int manufacturedYear, float maxSpeed) {
        super(brand, model, engine, manufacturedYear);
        this.maxSpeed = maxSpeed;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void description() {
        System.out.println("Diseñado para quienes viven la carretera intensamente: el " +
                super.getBrand() + " " + super.getModel() + " alcanza una velocidad máxima de " +
                maxSpeed + " km/h, combinando elegancia y rendimiento en cada curva.");
    }

    @Override
    public void getExportInfo() {
        System.out.println("This is the exportable info from SportsCar");
    }

    @Override
    public String toString() {
        return super.toString()+"SportsCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
