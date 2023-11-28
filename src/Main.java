import Espaciais.*;
import Planas.*;

public class Main {
    public static void main(String[] args) {
        HexagonoRegular hexagonoRegular = new HexagonoRegular(5);

        System.out.printf("%.2f\n",hexagonoRegular.calcularArea());
        System.out.printf("%.2f", hexagonoRegular.calcularPerimetro());
    }
}