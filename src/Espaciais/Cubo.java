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

    public String toString(int num) {
        if(num % 2 == 0){
            return String.format("Lado: %.2f",this.lado).toUpperCase();
        }
        else {
            return String.format("Lado: %.2f",this.lado).toLowerCase();        }
    }

}
