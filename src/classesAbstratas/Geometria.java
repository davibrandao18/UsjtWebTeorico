package classesAbstratas;

import java.util.ArrayList;

public class Geometria {
    public static void main(String args[]) {
        Quadrado quadrado = new Quadrado(10, 12);
        Triangulo triangulo = new Triangulo(8, 10, 4, 7);
        Retangulo retangulo = new Retangulo(7, 14);
        Losango losango = new Losango(10, 9);
        Circulo circulo = new Circulo(20, 70);
        Trapezio trapezio = new Trapezio(4, 6, 5, 6, 5);

        Cubo cubo = new Cubo(10, 3);
        Piramide piramide = new Piramide(4, 12);
        Esfera esfera = new Esfera(7);
        Cilindro cilindro = new Cilindro(15, 5);

        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(quadrado);
        figuras.add(triangulo);
        figuras.add(retangulo);
        figuras.add(losango);
        figuras.add(circulo);
        figuras.add(trapezio);

        String nomes[] = {"Quadrado", "Triangulo", "Retangulo", "Losango", "Circulo", "Trapezio"};
        int i = 0;
        
        System.out.println("\nGEOMETRIA PLANA:");
        for (Figura f : figuras) {
            System.out.println(nomes[i] +":");
            System.out.println("    Area: " +f.area());
            System.out.println("    Perimetro: " +f.perimetro());
            
            if (nomes[i].equals("Quadrado"))
                System.out.println("    Diagonal: " +quadrado.diagonal());

            if (nomes[i].equals("Retangulo"))
                System.out.println("    Diagonal: " +retangulo.diagonal());

            i++;
        }

        System.out.println("\nGEOMETRIA ESPACIAL:");

        ArrayList<Tridimensional> figTridimensional = new ArrayList<Tridimensional>();
        figTridimensional.add(cubo);
        figTridimensional.add(cilindro);
        figTridimensional.add(esfera);
        figTridimensional.add(piramide);

        String nomes3D[] = {"Cubo", "Cilindro", "Esfera", "Piramide"};
        int h = 0;

        for (Tridimensional f3D : figTridimensional) {
            System.out.println(nomes3D[h] +":");
            System.out.println("    Volume: " +f3D.volume());
            h++;
        }
    }
}