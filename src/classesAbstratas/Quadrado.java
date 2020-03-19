package classesAbstratas;

public class Quadrado extends Quadrilatero implements Diagonal{

    public Quadrado (double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area(){
        return getBase() * getAltura();
    }

    @Override
    public double perimetro(){
        return (getBase() * 2) + (getAltura() * 2);
    }

    public float diagonal() {
        double catOp = Math.pow(getBase(), 2);
        double catAdj = Math.pow(getAltura(), 2);
        double diagonal = Math.sqrt(catOp + catAdj);
        return (float) diagonal;
    }
}