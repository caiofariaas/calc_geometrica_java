package Espaciais;
// Piramide de Base Quadrada

public class Piramide {
    private double arestaBase, apotema, altura;

    public Piramide(double arestaBase, double apotema, double altura) {
        this.arestaBase = arestaBase;
        this.apotema = apotema;
        this.altura = altura;
    }

    public double calcularVolume(){
        return ((Math.pow(this.arestaBase, 2)) * this.altura) / 3;
    }

    public double calcularAreaSuperficial(){
        return (2 * this.arestaBase * this.apotema) + Math.pow(this.arestaBase, 2);
    }

    public String toString(int num) {

        if(num % 2 == 0){
            return String.format("Aresta Base: %.2f\nApotema: %.2f\nAltura: %.2f", this.arestaBase, this.apotema, this.altura).toUpperCase();
        }
        else{
            return String.format("Aresta Base: %.2f\nApotema: %.2f\nAltura: %.2f", this.arestaBase, this.apotema, this.altura).toLowerCase();
        }
    }
}
