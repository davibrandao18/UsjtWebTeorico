package classesAbstratas;

public class Poligono extends Figura {
    private double base;
    private double altura;
    private double baseMenor;
    private double baseMaior;
    private double ladoA;
    private double ladoB;

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Poligono(double base, double altura, double ladoA, double ladoB) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public Poligono(double baseMenor, double baseMaior, double altura, double ladoA, double ladoB) {
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    // Getters
    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getBaseMenor(){
        return this.baseMenor;
    }

    public double getBaseMaior(){
        return this.baseMaior;
    }

    public double getLadoA(){
        return this.ladoA;
    }

    public double getLadoB(){
        return this.ladoB;
    }

    // Setters
    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setBaseMenor(double baseMenor){
        this.baseMenor = baseMenor;
    }

    public void setBaseMaior(double baseMaior){
        this.baseMaior = baseMaior;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimetro() {
        return 0;
    }
}