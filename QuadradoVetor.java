public class QuadradoVetor {
    public static void main(String[] args) {
        // Verificar se 10 números foram passados como argumento
        if (args.length != 10) {
            System.out.println("Por favor, forneça exatamente 10 números inteiros.");
            return;
        }

        int[] numeros = new int[10];
        int[] quadrados = new int[10];

        // Converter os argumentos para inteiros e armazenar no vetor
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }

        // Calcular o quadrado de cada número
        for (int i = 0; i < 10; i++) {
            quadrados[i] = numeros[i] * numeros[i];
        }

        // Exibir os números originais
        System.out.println("Números originais:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Exibir os quadrados dos números
        System.out.println("\nQuadrados dos números:");
        for (int i = 0; i < 10; i++) {
            System.out.print(quadrados[i] + " ");
        }
    }
}
