package classesAbstratas;

public class Trapezio extends Quadrilatero {

    public Trapezio(double baseMenor, double baseMaior, double altura, double ladoA, double ladoB) {
        super(baseMenor, baseMaior, altura, ladoA, ladoB);
    }

    @Override
    public double perimetro(){
        return (getBaseMaior() + getBaseMenor() + getLadoA() + getLadoB());
    }

    @Override
    public double area(){
        return ( (getBaseMaior() + getBaseMenor()) * getAltura() ) / 2;
    }
}