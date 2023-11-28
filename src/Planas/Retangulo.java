package Planas;

public class Retangulo {
    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea(){
        return  this.base * this.altura;
    }

    public double calcularPerimetro(){
        return (2 * this.base) + (2 * this.altura);
    }
}
