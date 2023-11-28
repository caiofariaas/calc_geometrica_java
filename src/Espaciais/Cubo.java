package Espaciais;

public class Cubo {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double calcularVolume(){
        return Math.pow(this.lado, 3);
    }
    public double calcularAreaSuperficial(){
        return Math.pow(this.lado, 2) * 6;
    }
}
