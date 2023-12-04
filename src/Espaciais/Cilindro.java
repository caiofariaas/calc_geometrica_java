package Espaciais;

public class Cilindro {
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularVolume(){
        return Math.PI * this.altura * Math.pow(this.raio, 2);
    }

    public double calcularAreaSuperficial(){
        return (2 * Math.PI * this.raio * this.altura) + (2 * Math.PI * Math.pow(this.raio, 2));
    }

    public String resumo(int num) {
        if(num % 2 == 0){
            return String.format("raio: %.2f\nVolume: %.2f\nArea: %.2f",this.raio, this.calcularVolume(), this.calcularAreaSuperficial()).toUpperCase();
        }
        return String.format("raio: %.2f\nVolume: %.2f\nArea: %.2f",this.raio, this.calcularVolume(), this.calcularAreaSuperficial()).toLowerCase();
    }

}
