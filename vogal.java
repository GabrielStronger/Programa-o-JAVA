 import java.util.Scanner;
public class vogal {
    public static boolean isVowel(char letra) {
        
        letra = Character.toLowerCase(letra);

        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        if (Character.isLetter(letra)) {
            if (isVowel(letra)) {
                System.out.println(letra + " é uma vogal.");
            } else {
                System.out.println(letra + " é uma consoante.");
            }
        } else {
            System.out.println("O caractere digitado não é uma letra.");
        }
        scanner.close();
    }
}