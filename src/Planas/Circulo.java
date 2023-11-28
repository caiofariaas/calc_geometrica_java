package Planas;

public class Circulo {
    private double lado;

    public Circulo(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro(){
        return 4 * this.lado;
    }
    public double calcularArea(){
        return this.lado * this.lado;
    }
}
