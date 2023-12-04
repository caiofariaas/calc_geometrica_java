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
    public String resumo(int num) {
        if(num % 2 == 0){
            return String.format("Lado: %.2f\nVolume: %.2f\nArea: %.2f",this.lado, this.calcularPerimetro(), this.calcularArea()).toUpperCase();

        }
        return String.format("Lado: %.2f\nVolume: %.2f\nArea: %.2f",this.lado, this.calcularPerimetro(), this.calcularArea()).toLowerCase();
    }
}
