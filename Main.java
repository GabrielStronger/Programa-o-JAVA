import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Leitura dos 10 números inteiros
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Impressão dos números em ordem reversa
        System.out.println("Números em ordem reversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        
        scanner.close();
    }
}
