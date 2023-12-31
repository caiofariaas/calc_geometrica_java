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

    public String resumo(int num) {
        if(num % 2 == 0){
            return String.format("Lado: %.2f\nVolume: %.2f\nArea: %.2f",this.lado, this.calcularPerimetro(), this.calcularArea()).toUpperCase();

        }
        return String.format("Lado: %.2f\nVolume: %.2f\nArea: %.2f",this.lado, this.calcularPerimetro(), this.calcularArea()).toLowerCase();
    }
}
