import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.setLevel(Level.ALL);

        try {
            System.out.println("CALCULADORA");
            System.out.print("Digite um valor numerico: ");
            double num1 = scanner.nextDouble();

            System.out.print("Escolha a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            System.out.print("Digite segundo valor numerico: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    logger.info("Operação: " + num1 + " + " + num2);
                    break;
                case '-':
                    resultado = num1 - num2;
                    logger.info("Operação: " + num1 + " - " + num2);
                    break;
                case '*':
                    resultado = num1 * num2;
                    logger.info("Operação: " + num1 + " * " + num2);
                    break;
                case '/':
                    if (num2 == 0) {
                        logger.warning("divisão por zero.");
                        System.out.println("Erro: nao possivel dividir por zero");
                        return;
                    }
                    resultado = num1 / num2;
                    logger.info("Operação: " + num1 + " / " + num2);
                    break;
            }

            System.out.println("Resultado: " + resultado);

        } finally {
            scanner.close();
        }
    }
}