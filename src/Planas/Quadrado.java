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

    public String resumo(int num) {
        if(num % 2 == 0){
            return String.format("Lado: %.2f\nVolume: %.2f\nArea: %.2f",this.lado, this.calcularPerimetro(), this.calcularArea()).toUpperCase();

        }
        return String.format("Lado: %.2f\nVolume: %.2f\nArea: %.2f",this.lado, this.calcularPerimetro(), this.calcularArea()).toLowerCase();
    }

}
