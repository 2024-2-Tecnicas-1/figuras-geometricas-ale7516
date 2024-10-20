package com.mycompany.figurasgeometricas;

public class Circulo extends FiguraGeometrica {

    private double radio;

// Complejidad temporal: O(1) Tiempo constante.
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
// Complejidad temporal: O(1) Tiempo constante.
    public double getRadio() {
        return radio;
    }
// Complejidad temporal: O(1) Tiempo constante.
    public void setRadio(double radio) {
        this.radio = radio;
    }
// Complejidad temporal: O(1) Tiempo constante.
    @Override
    public double obtenerArea() {
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        return areaCirculo;
    }
// Complejidad temporal: O(1) Tiempo constante.
    @Override
    public double obtenerPerimetro() {
        double perimetroCirculo = 2 * Math.PI * radio;
        return perimetroCirculo;
    }

}
