import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countPositivos = 0; // Contador de valores positivos
        double somaPositivos = 0.0; // Soma dos valores positivos

        // Lê 6 valores
        for (int i = 0; i < 6; i++) {
            double valor = scanner.nextDouble();
            // Verifica se o valor é positivo
            if (valor > 0) {
                countPositivos++; // Incrementa o contador
                somaPositivos += valor; // Adiciona à soma
            }
        }

        // Cálculo da média dos valores positivos
        double mediaPositivos = somaPositivos / countPositivos;

        // Saída formatada
        System.out.println(countPositivos + " valores positivos");
        System.out.printf("%.1f\n", mediaPositivos); // Formata a média com um dígito após o ponto

        scanner.close();
    }
}
