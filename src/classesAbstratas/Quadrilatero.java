package classesAbstratas;

public class Quadrilatero extends Poligono {

    public Quadrilatero (double base, double altura) {
        super(base, altura);
    }

    public Quadrilatero(double baseMenor, double baseMaior, double altura, double ladoA, double ladoB) {
        super(baseMenor, baseMaior, altura, ladoA, ladoB);
    }
}