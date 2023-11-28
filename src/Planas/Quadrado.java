package Planas;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro(){
        return this.lado * 4;
    }

    public double calcularArea(){
        return this.lado * this.lado;
    }
}
