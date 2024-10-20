package com.mycompany.figurasgeometricas;

abstract public class FiguraGeometrica {

    private String nombre;
    private String color;
// Complejidad temporal: O(1) Tiempo constante.

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
// Complejidad temporal: O(1) Tiempo constante.

    public String getNombre() {
        return nombre;
    }
// Complejidad temporal: O(1) Tiempo constante.

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
// Complejidad temporal: O(1) Tiempo constante.

    public String getColor() {
        return color;
    }
// Complejidad temporal: O(1) Tiempo constante.

    public void setColor(String color) {
        this.color = color;
    }

    // Complejidad temporal: O(1) Tiempo constante.  
    public abstract double obtenerArea();

    // Complejidad temporal: O(1) Tiempo constante.
    public abstract double obtenerPerimetro();

}
