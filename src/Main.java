import Espaciais.*;
import Planas.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Bem-Vindo(a) a Calculadora Geometrica!!\nQual o seu nome?");

        while (true){
            int opt = Integer.parseInt(JOptionPane.showInputDialog(nome + ", Você deseja calcular figuras planas ou espaciais?\n" +
                    "1 <- Planas\n2 <- Espaciais\n0 <- Fechar"));

            if(opt == 1){
                int fig = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma figura!\n" +
                        "1 <- Circulo\n2 <- Hexagono Regular\n3 <- Quadrado\n4 <- Retangulo\n5 <- Triangulo"));

                switch (fig){
                    case 1 ->{
                        JOptionPane.showMessageDialog(null ,nome + ", Você selecionou o Circulo!");
                        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o Raio do Circulo: "));
                        Circulo circulo = new Circulo(raio);
                        JOptionPane.showMessageDialog(null, "Resumo\n" + circulo.resumo(2));
                    }
                    case 2 ->{
                        JOptionPane.showMessageDialog(null ,nome + ", Você selecionou o Hexagono Regular!");
                        double lado = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do lado: "));
                        HexagonoRegular hexagonoRegular = new HexagonoRegular(lado);
                        JOptionPane.showMessageDialog(null, "Resumo\n" + hexagonoRegular.resumo(1));
                    }
                    case 3 ->{
                        JOptionPane.showMessageDialog(null ,nome + ", Você selecionou o Quadrado!");
                        double lado = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do lado: "));
                        Quadrado quadrado = new Quadrado(lado);
                        JOptionPane.showMessageDialog(null,"Resumo\n" + quadrado.resumo(2));
                    }
                    case 4 ->{
                        JOptionPane.showMessageDialog(null ,nome + ", Você selecionou o Retangulo!");
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da altura: "));
                        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da Base: "));

                        Retangulo retangulo = new Retangulo(altura, base);

                        JOptionPane.showMessageDialog(null,"Resumo\n" + retangulo.resumo(3));
                    }
                    case 5 ->{
                        JOptionPane.showMessageDialog(null ,nome + ", Você selecionou o Triangulo!");
                        double lado = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do lado: "));
                        Triangulo triangulo = new Triangulo(lado);
                        JOptionPane.showMessageDialog(null,"Resumo\n" + triangulo.resumo(4));
                    }
                }

                break;
            }

            else if (opt == 2) {
                int fig = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma figura!\n" +
                        "1 <- Cilindro\n2 <- Cone\n3 <- Cubo\n4 <- Esfera\n5 <- Paralelepípedo\n6 <- Piramide"));

                switch (fig){
                    case 1 ->{
                        JOptionPane.showMessageDialog(null ,nome + ", Você selecionou o Cilindro!");

                    }
                    case 2 ->{
                        JOptionPane.showMessageDialog(null ,nome + ", Você selecionou o Cone!");
                    }
                    case 3 ->{
                        JOptionPane.showMessageDialog(null ,nome + ", Você selecionou o Cubo!");
                    }
                    case 4 ->{
                        JOptionPane.showMessageDialog(null ,nome + ", Você selecionou o Esfera!");
                    }
                    case 5 ->{
                        JOptionPane.showMessageDialog(null ,nome + ", Você selecionou o Paralelepipedo!");
                    }
                    case 6 ->{
                        JOptionPane.showMessageDialog(null ,nome + ", Você selecionou o Piramide!");
                    }
                }
            }

            else if (opt == 0) {
                JOptionPane.showMessageDialog(null, "Até a próxima!");
            }

            else{
                JOptionPane.showMessageDialog(null, "Esta opção não existe!");
            }
        }
    }
}
