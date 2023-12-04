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

    public String resumo(int num) {
        if(num % 2 == 0){
            return String.format("lado: %.2f\nVolume: %.2f\nArea: %.2f",this.lado, this.calcularVolume(), this.calcularAreaSuperficial()).toUpperCase();

        }
        return String.format("lado: %.2f\nVolume: %.2f\nArea: %.2f",this.lado, this.calcularVolume(), this.calcularAreaSuperficial()).toLowerCase();
    }
}
