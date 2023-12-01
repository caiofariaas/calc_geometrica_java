package Espaciais;

public class Cone {
    private double raio;
    private double altura;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularVolume(){
        return 0.33 * Math.PI * Math.pow(this.raio, 2) * this.altura;
    }

    public double calcularAreaSuperficial(){
        return Math.PI * this.raio * Math.sqrt((Math.pow(this.altura, 2) + Math.pow(this.raio, 2)));
    }

    public String toString(int num) {
        if(num % 2 == 0){
            return String.format("raio: %.2f",this.raio).toUpperCase();
        }
        else {
            return String.format("altura: %.2f",this.altura).toLowerCase();        }
    }

}
