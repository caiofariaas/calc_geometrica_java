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

    public String toString(int num) {
        if(num % 2 == 0){
            return String.format("Altura: %.2f\nBase: %.2f", this.altura, this.base).toUpperCase();
        }
        else {
            return String.format("Altura: %.2f\nBase: %.2f", this.altura, this.base).toLowerCase();
        }
    }
}
