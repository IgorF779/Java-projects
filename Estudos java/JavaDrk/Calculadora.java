import java.util.Scanner;

public class Calculadora {
    private static double resultado;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double numero1, numero2;

            System.out.println("Digite o primeiro numero: ");
            numero1 = scanner.nextDouble();

            System.out.println("Digite o segundo numero: ");
            numero2 = scanner.nextDouble();

            System.out.println("Coloque qual operação você deseja");
            System.out.println("+, -, *, /): ");

            char operação = scanner.next().charAt(0);

            if (operação == '+') {
                resultado = numero1 + numero2;
            } else if (operação == '-') {
                resultado = numero1 - numero2;
            } else if (operação == '*') {
                resultado = numero1 * numero2;
            } else if (operação == '/') {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Operação inválida.");
                return;
            }
            System.out.println(numero1 + " " + operação + " " + numero2 + " = " + resultado);
        }
    }
}
