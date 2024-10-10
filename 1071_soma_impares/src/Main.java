import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt(); // Lê o primeiro valor
        int y = scanner.nextInt(); // Lê o segundo valor

        // Inicializa a soma dos números ímpares
        int somaImpares = 0;

        // Determina o intervalo, garantindo que x seja menor que y
        int start = Math.min(x, y) + 1; // Começa após o menor valor
        int end = Math.max(x, y); // Termina no maior valor

        // Loop para calcular a soma dos números ímpares no intervalo
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) { // Verifica se i é ímpar
                somaImpares += i; // Adiciona à soma
            }
        }

        // Imprime a soma dos números ímpares
        System.out.println(somaImpares);

        scanner.close();
    }
}
