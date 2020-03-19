package classesAbstratas;

public class Piramide extends Tridimensional {
    private double areaBase;
    private double altura;

    public Piramide(double areaBase, double altura) {
        this.areaBase = areaBase;
        this.altura = altura;
    }

    public double getAreaBase(){
        return this.areaBase;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double volume() {
        return ( getAreaBase() * getAltura() ) / 3;
    }
}