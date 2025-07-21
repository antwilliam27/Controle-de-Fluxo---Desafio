import java.util.Scanner;

public class Contador {
    public static class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}


    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // Lê o primeiro número

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // Lê o segundo número

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // Imprime a mensagem de erro da exceção personalizada
            System.out.println("Erro: " + exception.getMessage());
        }

        terminal.close(); // Boa prática: fechar o scanner
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se parametroUm é MAIOR ou IGUAL que parametroDois e lança exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        // Realiza o for para imprimir os números com base na contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
