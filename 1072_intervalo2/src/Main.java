import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Lê o número de valores a serem lidos
        int inCount = 0; // Contador para valores dentro do intervalo
        int outCount = 0; // Contador para valores fora do intervalo

        // Loop para ler os N valores
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt(); // Lê o valor X
            
            // Verifica se o valor está no intervalo [10, 20]
            if (x >= 10 && x <= 20) {
                inCount++; // Incrementa o contador de dentro
            } else {
                outCount++; // Incrementa o contador de fora
            }
        }

        // Imprime os resultados
        System.out.println(inCount + " in");
        System.out.println(outCount + " out");

        scanner.close();
    }
}
