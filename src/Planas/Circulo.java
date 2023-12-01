package Planas;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularPerimetro(){
        return 4 * this.raio;
    }
    public double calcularArea(){
        return this.raio * this.raio;
    }

    public String toString(int num) {
        if(num % 2 == 0){
            return String.format("raio: %.2f",this.raio).toUpperCase();
        }
        else {
            return String.format("raio: %.2f",this.raio).toLowerCase();        }
    }
}
