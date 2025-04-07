package classes;

public class SUV extends Car{
    private String traction;

    public SUV(String brand, String model, String engine, int manufacturedYear, String traction) {
        super(brand, model, engine, manufacturedYear);
        this.traction = traction;
    }

    @Override
    public void description() {
        System.out.println("El  " + super.getBrand() + " " + super.getModel() +
                ", con tracción " + getTraction() +
                ", es un SUV que no teme salir del asfalto. Perfecto para aventuras al aire libre," +
                "terrenos difíciles y escapadas de fin de semana con potencia y seguridad.");
    }

    public String getTraction() {
        return traction;
    }

    public void setTraction(String traction) {
        this.traction = traction;
    }

    @Override
    public String toString() {
        return super.toString() + "SUV{" +
                "traction='" + traction + '\'' +
                '}';
    }
}
