package classesAbstratas;

public class Circulo extends Figura {
    private double raio;
    private double circunferencia;

    public Circulo(double raio, double circunferencia) {
        this.raio = raio;
        this.circunferencia = circunferencia;
    }

    public double getRaio(){
        return this.raio;
    }

    public double getCircunferencia(){
        return this.circunferencia;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setCircunferencia(double cincunferencia) {
        this.circunferencia = cincunferencia;
    }

    @Override
    public double area() {
        return (3.14 * Math.pow(getRaio(), 2));
    }

    @Override
    public double perimetro() {
        return circunferencia;
    }
    
}