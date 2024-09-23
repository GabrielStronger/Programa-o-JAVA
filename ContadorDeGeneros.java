
public class ContadorDeGeneros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorFeminino = 0;
        int contadorMasculino = 0;
        int contadorNeutro = 0;
        int contadorInvalido = 0;

        while (true) {
            System.out.print("Digite um gênero (F para Feminino, M para Masculino, N para Neutro, X para sair): ");
            char genero = scanner.next().toUpperCase().charAt(0);

            // Verifica se o usuário digitou 'X' para sair
            if (genero == 'X') {
                System.out.println("Programa terminado.");
                break;
            }

            // Verifica o gênero e atualiza o contador correspondente
            switch (genero) {
                case 'F':
                    System.out.println("F - Feminino");
                    contadorFeminino++;
                    break;
                case 'M':
                    System.out.println("M - Masculino");
                    contadorMasculino++;
                    break;
                case 'N':
                    System.out.println("N - Neutro");
                    contadorNeutro++;
                    break;
                default:
                    System.out.println("Gênero Inválido");
                    contadorInvalido++;
                    break;
            }
        }

        // Exibe a contagem de cada tipo de entrada
        System.out.println("Contagem final:");
        System.out.println("Feminino: " + contadorFeminino);
        System.out.println("Masculino: " + contadorMasculino);
        System.out.println("Neutro: " + contadorNeutro);
        System.out.println("Gênero Inválido: " + contadorInvalido);

        scanner.close();
    }
}



    
}
