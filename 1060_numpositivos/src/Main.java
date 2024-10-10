import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPositivos = 0; // Contador para valores positivos

        // Lê 6 valores
        for (int i = 0; i < 6; i++) {
            double valor = scanner.nextDouble();
            // Verifica se o valor é positivo
            if (valor > 0) {
                countPositivos++; // Incrementa o contador se o valor for positivo
            }
        }

        // Imprime a quantidade de valores positivos
        System.out.println(countPositivos + " valores positivos");
        
        scanner.close();
    }
}
