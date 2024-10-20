package com.mycompany.figurasgeometricas;

public class Rectangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;

// Complejidad temporal: O(1) Tiempo constante.
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
// Complejidad temporal: O(1) Tiempo constante.   

    public double getLado1() {
        return lado1;
    }
// Complejidad temporal: O(1) Tiempo constante.

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
// Complejidad temporal: O(1) Tiempo constante.

    public double getLado2() {
        return lado2;
    }
// Complejidad temporal: O(1) Tiempo constante.

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
// Complejidad temporal: O(1) Tiempo constante.    

    @Override
    public double obtenerArea() {
        double areaRectangulo = lado1 * lado2;
        return areaRectangulo;
    }
// Complejidad temporal: O(1) Tiempo constante.

    @Override
    public double obtenerPerimetro() {
        double perimetroRectangulo = 2 * (lado1 + lado2);
        return perimetroRectangulo;

    }

}
