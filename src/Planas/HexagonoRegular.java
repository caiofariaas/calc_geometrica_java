package Planas;

public class HexagonoRegular {
    private double lado;

    public HexagonoRegular(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro(){
        return this.lado * 6;
    }

    public double calcularArea(){
        return 6 * (this.lado * this.lado) * Math.sqrt(0.75);
    }
    public String toString(int num) {
        if(num % 2 == 0){
            return String.format("Lado: %.2f",this.lado).toUpperCase();
        }
        else {
            return String.format("Lado: %.2f",this.lado).toLowerCase();        }
    }
}
