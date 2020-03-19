package classesAbstratas;

public class Cilindro extends Tridimensional {
    private double base;
    private double altura;
    private double raio;

    public Cilindro(double altura, double raio) {
        this.altura = altura;
        this.raio = raio;
    }


    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double volume() {
        return ( 3.14 * (Math.pow(getRaio(),2)) * getAltura() );
    }
}