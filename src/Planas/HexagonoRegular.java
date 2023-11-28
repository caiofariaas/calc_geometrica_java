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
}
