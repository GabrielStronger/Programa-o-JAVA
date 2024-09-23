public class Boletim {
    public static void main(String[] args) {
        double[][] notas = {
            {9.9, 8.0, 6.4, 9.9}, // Matemática
            {7.3, 8.8, 9.3, 9.8}, // Física
            {6.3, 8.2, 7.7, 7.1}, // Química
            {7.6, 9.9, 8.6, 9.7}, // Biologia
            {6.8, 7.2, 6.2, 7.2}  // História
        };

        String[] disciplinas = {
            "Matemática",
            "Física",
            "Química",
            "Biologia",
            "História"
        };

        boolean todasAprovadas = true;

        // Loop para calcular as médias e verificar aprovação
        for (int i = 0; i < notas.length; i++) {
            double soma = 0.0;

            // Calcular a média da disciplina
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;

            // Verificar se foi aprovado
            String status = media >= 6.0 ? "APROVADO" : "REPROVADO";
            if (status.equals("REPROVADO")) {
                todasAprovadas = false;
            }

            // Exibir resultado da disciplina
            System.out.printf("%s:\t%.1f - %s%n", disciplinas[i], media, status);
        }

        // Exibir o status final
        System.out.println("--------------------------------------------------------");
        System.out.println("Status Final - " + (todasAprovadas ? "APROVADO" : "REPROVADO"));
    }
}
