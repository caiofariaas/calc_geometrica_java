package Planas;
// Equilatero

public class Triangulo {
    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return  this.lado * Math.sqrt(0.75);
    }
    public double calcularPerimetro(){
        return this.lado * 3;
    }
}
