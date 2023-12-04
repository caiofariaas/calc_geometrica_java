import Espaciais.*;
import Planas.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Bem-Vindo(a) a Calculadora Geometrica!!\nQual o seu nome?");

        while (true) {
            int opt;

            while (true){
                try {
                    opt = Integer.parseInt(JOptionPane.showInputDialog(nome + ", Você deseja calcular figuras planas ou espaciais?\n" +
                            "1 <- Planas\n2 <- Espaciais\n0 <- Fechar"));
                    break;
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                }
            }

            if (opt == 1) {
                int fig;

                while (true){
                    try {
                        fig = Integer.parseInt(JOptionPane.showInputDialog("""
                        Escolha uma figura!
                        1 <- Circulo
                        2 <- Hexagono Regular
                        3 <- Quadrado
                        4 <- Retangulo
                        5 <- Triangulo
                        0 <- Fechar"""));
                        break;
                    }
                    catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                    }
                }

                switch (fig) {
                    case 1 -> {
                        double raio;
                        JOptionPane.showMessageDialog(null, nome + ", Você selecionou o Circulo!");

                        while (true){
                            try {
                                raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o Raio do Circulo: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }
                        Circulo circulo = new Circulo(raio);
                        JOptionPane.showMessageDialog(null, "Resumo\n" + circulo.resumo(2));
                    }

                    case 2 -> {
                        double lado;
                        JOptionPane.showMessageDialog(null, nome + ", Você selecionou o Hexagono Regular!");

                        while (true){
                            try {
                                lado = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do lado: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }

                        HexagonoRegular hexagonoRegular = new HexagonoRegular(lado);
                        JOptionPane.showMessageDialog(null, "Resumo\n" + hexagonoRegular.resumo(1));
                    }

                    case 3 -> {
                        double lado;
                        JOptionPane.showMessageDialog(null, nome + ", Você selecionou o Quadrado!");

                        while (true){
                            try {
                                lado = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do lado: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }
                        Quadrado quadrado = new Quadrado(lado);
                        JOptionPane.showMessageDialog(null, "Resumo\n" + quadrado.resumo(2));
                    }

                    case 4 -> {
                        double altura, base;

                        JOptionPane.showMessageDialog(null, nome + ", Você selecionou o Retangulo!");

                        while (true){
                            try {
                                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da altura: "));
                                break;

                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");

                            }
                        }
                        while (true){
                            try {
                                base = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da Base: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }

                        Retangulo retangulo = new Retangulo(altura, base);
                        JOptionPane.showMessageDialog(null, "Resumo\n" + retangulo.resumo(3));
                    }

                    case 5 -> {
                        double lado;
                        JOptionPane.showMessageDialog(null, nome + ", Você selecionou o Triangulo!");

                        while (true){
                            try {
                                lado = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do lado: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }
                        Triangulo triangulo = new Triangulo(lado);
                        JOptionPane.showMessageDialog(null, "Resumo\n" + triangulo.resumo(4));
                    }

                    case 0 -> {
                        JOptionPane.showMessageDialog(null, "Até a próxima!");
                        return;
                    }

                    default -> JOptionPane.showMessageDialog(null, "Esta Opção não existe!");
                }
            } else if (opt == 2) {
                int fig;

                while (true){
                    try {
                        fig = Integer.parseInt(JOptionPane.showInputDialog("""
                        Escolha uma figura!
                        1 <- Circulo
                        2 <- Hexagono Regular
                        3 <- Quadrado
                        4 <- Retangulo
                        5 <- Triangulo
                        0 <- Fechar"""));
                        break;
                    }
                    catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                    }
                }

                switch (fig) {
                    case 1 -> {
                        double altura, raio;
                        JOptionPane.showMessageDialog(null, nome + ", Você selecionou o Cilindro!");

                        while (true){
                            try {
                                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da altura: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }
                        while (true){
                            try {
                                raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o Raio: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }
                        Cilindro cilindro = new Cilindro(raio, altura);
                        JOptionPane.showMessageDialog(null, "Resumo\n" + cilindro.resumo(7));
                    }

                    case 2 -> {
                        double altura, raio;
                        JOptionPane.showMessageDialog(null, nome + ", Você selecionou o Cone!");

                        while (true){
                            try {
                                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da altura: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }
                        while (true){
                            try {
                                raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o Raio: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }

                        Cone cone = new Cone(raio, altura);
                        JOptionPane.showMessageDialog(null, "Resumo\n" + cone.resumo(6));
                    }

                    case 3 -> {
                        double lado;
                        JOptionPane.showMessageDialog(null, nome + ", Você selecionou o Cubo!");

                        while (true){
                            try {
                                lado = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do lado: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }

                        Cubo cubo = new Cubo(lado);
                        JOptionPane.showMessageDialog(null, "Resumo\n" + cubo.resumo(1));
                    }

                    case 4 -> {
                        double raio;
                        JOptionPane.showMessageDialog(null, nome + ", Você selecionou o Esfera!");

                        while (true){
                            try {
                                raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o Raio: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }

                        Esfera esfera = new Esfera(raio);
                        JOptionPane.showMessageDialog(null, "Resumo\n" + esfera.resumo(2));
                    }

                    case 5 -> {
                        double altura, largura, comprimento;
                        JOptionPane.showMessageDialog(null, nome + ", Você selecionou o Paralelepipedo!");
                        
                        while (true){
                            try {
                                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da altura: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }

                        while (true){
                            try {
                                largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da largura: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }
                        while (true){
                            try {
                                comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do comprimento: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }

                        Paralelepipedo paralelepipedo = new Paralelepipedo(comprimento, altura, largura);
                        JOptionPane.showMessageDialog(null, "Resumo\n" + paralelepipedo.resumo(3));
                    }

                    case 6 -> {
                        double arestaBase, apotema, altura;
                        JOptionPane.showMessageDialog(null, nome + ", Você selecionou o Piramide!");

                        while (true){
                            try {
                                arestaBase = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da Aresta da Base: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }
                        while (true){
                            try {
                                apotema = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da Aresta da Base: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }
                        while (true){
                            try {
                                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da altura: "));
                                break;
                            }
                            catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor numérico!");
                            }
                        }

                        Piramide piramide = new Piramide(arestaBase, apotema, altura);
                        JOptionPane.showMessageDialog(null, "Resumo\n" + piramide.resumo(4));
                    }

                    case 0 -> {
                        JOptionPane.showMessageDialog(null, "Até a próxima!");
                        return;
                    }

                    default -> JOptionPane.showMessageDialog(null, "Esta Opção não existe!");
                }
            }
            else if (opt == 0) {
                JOptionPane.showMessageDialog(null, "Até a próxima!");
                return;
            }
            else {
                JOptionPane.showMessageDialog(null, "Esta opção não existe!");
            }
        }
    }
}
