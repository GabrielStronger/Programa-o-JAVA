import java.util.Scanner;

public class Calculadora {
    private int num1;
    private int num2;
    public void imprimeMenu() {
        System.out.println("Escolha a opção:");
        System.out.println("'+'  - Soma de 2 números inteiros.");
        System.out.println("-    - Diferença entre 2 números (maior pelo menor).");
        System.out.println("*    - Produto entre 2 números.");
        System.out.println("/    - Divisão entre 2 números (o denominador não pode ser zero).");
        System.out.println("S ou s - Sair");
    }

    public boolean leOpcao() {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        while (true) {
            imprimeMenu();
            System.out.print("Digite a opção: ");
            opcao = scanner.nextLine().trim();
            if (opcao.equals("+") || opcao.equals("-") || opcao.equals("*") || opcao.equals("/")) {
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextInt();
                scanner.nextLine(); 
                executaOperacao(opcao);
                return true;
            } else if (opcao.equalsIgnoreCase("S")) {
                return false;
            } else {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }
    private void executaOperacao(String opcao) {
        switch (opcao) {
            case "+":
                System.out.println("Resultado da soma: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Resultado da diferença: " + Math.abs(num1 - num2));
                break;
            case "*":
                System.out.println("Resultado do produto: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Resultado da divisão: " + ((double) num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                }
                break;
        }
    }
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        boolean continuar = true;

        while (continuar) {
            continuar = calc.leOpcao();
        }

        System.out.println("Calculadora encerrada.");
    }
}
