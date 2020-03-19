package classesAbstratas;

public class Losango extends Quadrilatero {
    public Losango(double base, double altura){
        super(base, altura);
    }

    @Override
    public double perimetro(){
        return (getBase() * 4);
    }

    @Override
    public double area(){
        return getBase() * getAltura();
    }
}