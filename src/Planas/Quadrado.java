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

    public String toString(int num) {
        if(num % 2 == 0){
            return String.format("Lado: %.2f",this.lado).toUpperCase();
        }
        else {
            return String.format("Lado: %.2f",this.lado).toLowerCase();        }
    }
}
