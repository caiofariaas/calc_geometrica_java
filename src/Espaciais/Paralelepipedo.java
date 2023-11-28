package Espaciais;

public class Paralelepipedo {
    private double comprimento;
    private double altura;
    private double largura;

    public Paralelepipedo(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularVolume(){
        return this.comprimento * this.altura * this.largura;
    }

    public double calcularAreaSuperficial(){
        return 2 * ((this.comprimento * this.altura) + (this.altura * this.largura) * (this.comprimento * this.largura));
    }
}
