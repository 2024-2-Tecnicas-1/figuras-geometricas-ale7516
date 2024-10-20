package com.mycompany.figurasgeometricas;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

// Complejidad temporal: O(1) Tiempo constante.
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
// Complejidad temporal: O(1) Tiempo constante.

    public double getBase() {
        return base;
    }
// Complejidad temporal: O(1) Tiempo constante.

    public void setBase(double base) {
        this.base = base;
    }
// Complejidad temporal: O(1) Tiempo constante.

    public double getAltura() {
        return altura;
    }
// Complejidad temporal: O(1) Tiempo constante.

    public void setAltura(double altura) {
        this.altura = altura;
    }
// Complejidad temporal: O(1) Tiempo constante.

    @Override
    public double obtenerArea() {
        double areaTriangulo = (base * altura) / 2;
        return areaTriangulo;
    }
// Complejidad temporal: O(1) Tiempo constante.

    @Override
    public double obtenerPerimetro() {
        double perimetroTriangulo = 3 * base;
        return perimetroTriangulo;

    }

}
