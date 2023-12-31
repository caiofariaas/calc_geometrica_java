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

    public String resumo(int num) {
        if(num % 2 == 0){
            return String.format("raio: %.2f\nVolume: %.2f\nArea: %.2f",this.raio, this.calcularPerimetro(), this.calcularArea()).toUpperCase();
        }
        return String.format("raio: %.2f\nVolume: %.2f\nArea: %.2f",this.raio, this.calcularPerimetro(), this.calcularArea()).toLowerCase();
    }
}
