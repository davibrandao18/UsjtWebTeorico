package classesAbstratas;

public class Cubo extends Tridimensional{

    public Cubo(double lado, double profundidade){
        this.lado = lado;
        this.profundidade = profundidade;
    }

    private double lado;
    private double profundidade;

    // Getters
    public double getLado() {
        return this.lado;
    }

    public double getProfundidade() {
        return this.profundidade;
    }

    // Setters
    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public double volume() {
        return ( 3.14 * (Math.pow(getLado(), 2)) * getProfundidade() ) / 3;
    }
}