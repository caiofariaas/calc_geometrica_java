package Espaciais;

public class Esfera {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double calcularVolume(){
        return 1.33 * Math.PI * Math.pow(raio, 3);
    }
    public double calcularAreaSuperficial(){
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    public String resumo(int valor){
        if(valor % 2 == 0){
            return String.format("raio: %.2f\nVolume: %.2f\nArea: %.2f",this.raio, this.calcularVolume(), this.calcularAreaSuperficial()).toUpperCase();
        }
        return String.format("raio: %.2f\nVolume: %.2f\nArea: %.2f",this.raio, this.calcularVolume(), this.calcularAreaSuperficial()).toLowerCase();
    }
}
