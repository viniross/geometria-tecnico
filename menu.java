import java.util.Scanner;

public class Menu {
    
    public void Principal(){
        Scanner scanner = new Scanner(System.in);
 
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
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("\nEscolha a fórmula que deseja calcular:");
                        System.out.println("1 - Área do quadrado");
                        System.out.println("2 - Perímetro do quadrado");
                    break;
                    case 2:
                        System.out.println("\nEscolha a fórmula que deseja calcular:");
                        System.out.println("1 - Área do retângulo");
                        System.out.println("2 - Perímetro do retângulo");
                    break;
                    case 3:
                        System.out.println("\nEscolha a fórmula que deseja calcular:");
                        System.out.println("1 - Área do triângulo");
                        System.out.println("2 - Perímetro do triângulo");
                    break;
                    case 4:
                        System.out.println("\nEscolha a fórmula que deseja calcular:");
                        System.out.println("1 - Área do triângulo equilátero");
                        System.out.println("2 - Perímetro do triângulo equilátero");
                    break;
                    case 5:

                    break;
                    case 6:
                    
                    break;
                    case 7:
                    
                    break;
                    case 8:
                    
                    break;
                    
                    default:
                    break;
                }
            
            break;
        }


        scanner.close();
    }
}