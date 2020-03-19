package classesAbstratas;

public class Triangulo extends Poligono {

    public Triangulo(double base, double altura, double ladoA, double ladoB) {
        super(base, altura, ladoA, ladoB);
    }

    @Override
    public double perimetro(){
        return getBase() + getLadoA() + getLadoB();
    }

    @Override
    public double area(){
        return (getBase() * getAltura()) / 2;
    }
}