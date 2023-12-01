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
}
