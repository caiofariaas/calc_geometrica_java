import Espaciais.*;
import Planas.*;

public class Main {
    public static void main(String[] args) {
        HexagonoRegular hexagonoRegular = new HexagonoRegular(5);
        Retangulo retangulo = new Retangulo(10, 20);

        System.out.printf("%.2f\n",hexagonoRegular.calcularArea());
        System.out.printf("%.2f \n", hexagonoRegular.calcularPerimetro());

        System.out.println(retangulo.toString(2));
    }
}
