import java.util.Scanner;

public class Menu {
    
    public void Principal(){
        Scanner scanner = new Scanner(System.in);
        Plana plana = new Plana();
 
        System.out.println("Escolha o tipo de forma que deseja calcular:");
        System.out.println("1 - Plana");
        System.out.println("2 - Espacial \n");
        int acao = scanner.nextInt();
 
    
        switch (acao) {
            case 1:
                System.out.println("\nEscolha qual forma deseja calcular:");
                System.out.println("1 - Quadrado");
                System.out.println("2 - Retangulo");
                System.out.println("3 - Triangulo");
                System.out.println("4 - Triangulo Equilatero");
                System.out.println("5 - Paralelogramo");
                System.out.println("6 - Losango");
                System.out.println("7 - Trapezio");
                System.out.println("8 - Circunferencia \n");
                int forma = scanner.nextInt();
                int formula = scanner.nextInt();

                switch (forma) {
                    case 1:
                        System.out.println("\nEscolha a fórmula que deseja calcular:");
                        System.out.println("1 - Área do quadrado");
                        System.out.println("2 - Perímetro do quadrado");
                        switch (formula) {
                            case 1:
                                System.out.println("Digite o valor do lado do seu quadrado:");
                                double area = plana.areaQuadrado();
                                System.out.println("Área do quadrado: " + area);
                                break;
                            case 2:
                                double perimetro = plana.perimetroQuadradoLosango();
                                System.out.println("Perímetro do quadrado: " + perimetro);
                                break;
                            default: System.out.println("Opção inválida! Selecione outra opção.");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("\nEscolha a fórmula que deseja calcular:");
                        System.out.println("1 - Área do retângulo");
                        System.out.println("2 - Perímetro do retângulo");
                        switch (formula) {
                            case 1:
                                double area = plana.areaRetangulo();
                                System.out.println("Área do retângulo: " + area);
                                break;
                            case 2:
                                double perimetro = plana.perimetroParalelogramoRetangulo();
                                System.out.println("Perímetro do Retângulo: " + perimetro);
                                break;
                            default: System.out.println("Opção inválida! Selecione outra opção.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("\nEscolha a fórmula que deseja calcular:");
                        System.out.println("1 - Área do triângulo");
                        System.out.println("2 - Perímetro do triângulo");
                        switch (formula) {
                            case 1:
                                double area = plana.areaTriangulo();
                                System.out.println("Área do triângulo: " + area);
                                break;
                            case 2:
                                double perimetro = plana.perimetroTriangulo();
                                System.out.println("Perímetro do triângulo: " + perimetro);
                                break;
                            default: System.out.println("Opção inválida! Selecione outra opção.");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("\nEscolha a fórmula que deseja calcular:");
                        System.out.println("1 - Área do triângulo equilátero");
                        System.out.println("2 - Perímetro do triângulo equilátero");
                        switch (formula) {
                            case 1:
                                double area = plana.areaTrianguloEqui();
                                System.out.println("Área do triângulo equilátero: " + area);
                                break;
                            case 2:
                                double perimetro = plana.perimetroTrianguloEqui();
                                System.out.println("Perímetro do triângulo equilátero: " + perimetro);
                                break;
                            default: System.out.println("Opção inválida! Selecione outra opção.");
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("\nEscolha a fórmula que deseja calcular:");
                        System.out.println("1 - Área do paralelograma");
                        System.out.println("2 - Perímetro do paralelograma");
                        switch (formula) {
                            case 1:
                                double area = plana.areaParalelogramo();
                                System.out.println("Área do paralelograma: " + area);
                                break;
                            case 2:
                                double perimetro = plana.perimetroParalelogramoRetangulo();
                                System.out.println("Perímetro do paralelograma: " + perimetro);
                                break;
                            default: System.out.println("Opção inválida! Selecione outra opção.");
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("\nEscolha a fórmula que deseja calcular:");
                        System.out.println("1 - Área do losango");
                        System.out.println("2 - Perímetro do losango");
                        switch (formula) {
                            case 1:
                                double area = plana.areaLosango();
                                System.out.println("Área do losango: " + area);
                                break;
                            case 2:
                                double perimetro = plana.perimetroQuadradoLosango();
                                System.out.println("Perímetro do losango: " + perimetro);
                                break;
                            default: System.out.println("Opção inválida! Selecione outra opção.");
                                break;
                        }
                        break;
                    case 7:
                        System.out.println("\nEscolha a fórmula que deseja calcular:");
                        System.out.println("1 - Área do trapézio");
                        System.out.println("2 - Perímetro do trapézio");
                        switch (formula) {
                            case 1:
                                double area = plana.areaTrapezio();
                                System.out.println("Área do trapézio: " + area);
                                break;
                            case 2:
                                double perimetro = plana.perimetroTrapezio();
                                System.out.println("Perímetro do trapézio: " + perimetro);
                                break;
                            default: System.out.println("Opção inválida! Selecione outra opção.");
                                break;
                        }
                        break;
                    case 8:
                        System.out.println("\nEscolha a fórmula que deseja calcular:");
                        System.out.println("1 - Área superficial do círculo");
                        System.out.println("2 - Comprimento do círculo");
                        switch (formula) {
                            case 1:
                                double area = plana.areaCirculo();
                                System.out.println("Área do trapézio: " + area);
                                break;
                            case 2:
                                double perimetro = plana.comprimentoCirculo();
                                System.out.println("Comprimento do círculo: " + perimetro);
                                break;
                            default: System.out.println("Opção inválida! Selecione outra opção.");
                                break;
                        }
                        break;
                    default: System.out.println("Opção inválida! Selecione outra opção.");
                    break;
                }
                break;
                    case 2:
                        System.out.println("\nEscolha qual forma deseja calcular:");
                        System.out.println("1 - Cilindro");
                        System.out.println("2 - Pirâmide");
                        System.out.println("3 - Cone");
                        System.out.println("4 - Troncos");
                        System.out.println("5 - Esfera");
                        forma = scanner.nextInt();
                        formula = scanner.nextInt();

                        switch (forma) {
                            case 1:
                                System.out.println("\nEscolha a fórmula que deseja calcular:");
                                System.out.println("1 - Área da base do cilindro");
                                System.out.println("2 - Área lateral do cilindro");
                                System.out.println("3 - Volume do cilindro");   
                                break;
                            case 2:
                                System.out.println("\nEscolha a fórmula que deseja calcular:");
                                System.out.println("1 - Área lateral da pirâmide");
                                System.out.println("2 - Área total da pirâmide");
                                System.out.println("3 - Volume da pirâmide");
                                break;
                            case 3:
                                System.out.println("\nEscolha a fórmula que deseja calcular:");
                                System.out.println("1 - Área lateral do cone");
                                System.out.println("2 - Área da base do cone");
                                System.out.println("3 - Volume do cone");
                                break;
                            case 4:
                                System.out.println("\nEscolha a fórmula que deseja calcular:");
                                System.out.println("1 - Volume do tronco de cone");
                                System.out.println("2 - Volume do tronco da pirâmide");
                                break;
                            case 5:
                                System.out.println("\nEscolha a fórmula que deseja calcular:");
                                System.out.println("1 - Área superficial da esfera");
                                System.out.println("2 - Volume da esfera");
                                break;

                            default: System.out.println("Opção inválida! Selecione outra opção.");
                                break;
                        }
        }
        scanner.close();
    }
    
}