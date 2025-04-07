package classes;

public class Sedan extends Car{
    private float bootCapacity;

    public Sedan(String brand, String model, String engine, int manufacturedYear, float bootCapacity) {
        super(brand, model, engine, manufacturedYear);
        this.bootCapacity = bootCapacity;

    }

    @Override
    public void description() {
        System.out.println("Con su espacioso maletero de " + getBootCapacity() +
                " litros y un diseño pensado para el confort, el " + super.getBrand() +
                " " + super.getModel() +
                " es el compañero ideal para viajes familiares y trayectos diarios con estilo.");
    }

    public float getBootCapacity() {
        return bootCapacity;
    }

    public void setBootCapacity(float bootCapacity) {
        this.bootCapacity = bootCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+"Sedan{" +
                "bootCapacity=" + bootCapacity +
                '}';
    }
}
