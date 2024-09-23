import java.util.Scanner;

public class genero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char genero;
        while (true) {
            System.out.print("digite um gênero (F para Feminino, M para Masculino, N para Neutro, X para genero invalido): ");
            genero = scanner.next().toUpperCase().charAt(0);
            if (genero == 'X') {
                System.out.println("generp invalido.");
                break;
            }
            switch (genero) {
                case 'F':
                    System.out.println("F - Feminino");
                    break;
                case 'M':
                    System.out.println("M - Masculino");
                    break;
                case 'N':
                    System.out.println("N - Neutro");
                    break;
                default:
                    System.out.println("Gênero Inválido");
                    break;
            }
        }

        scanner.close();
    }
}

