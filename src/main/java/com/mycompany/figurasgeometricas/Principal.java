package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {
    
//Complejidad temporal: O(1) Tiempo Constante
    public static void main(String[] args) {

        String nombre;
        String color;
        int tipoFigura;
        FiguraGeometrica figura = null;

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la figura");
        nombre = lector.nextLine();
        System.out.println("Ingrese el color de la figura");
        color = lector.nextLine();
        System.out.println("Ingrese el tipo de figura 1: Circulo 2: Rectángulo 3: Triángulo");

        tipoFigura = lector.nextInt();
        

        switch (tipoFigura) {

            case 1:
                System.out.println("Ingrese el radio del círculo");
                double radio = lector.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;

            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectángulo");
                double lado1 = lector.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectangulo");
                double lado2 = lector.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
                break;

            case 3:
                System.out.println("Ingrese el valor de la base del triángulo");
                double base = lector.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo");
                double altura = lector.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;

            default:
                System.out.println("Ingrese un tipo de figura valido");
                break;
        }
        if (figura != null) {
            System.out.println("Área de la figura: " + figura.obtenerArea());
            System.out.println("Perímetro de la figura: " + figura.obtenerPerimetro());
        }
    }
}
