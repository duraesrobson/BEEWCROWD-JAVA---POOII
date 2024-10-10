import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countPares = 0; // Contador de valores pares

        // Lê 5 valores
        for (int i = 0; i < 5; i++) {
            int valor = scanner.nextInt();
            // Verifica se o valor é par
            if (valor % 2 == 0) {
                countPares++; // Incrementa o contador se for par
            }
        }

        // Saída formatada
        System.out.println(countPares + " valores pares");

        scanner.close();
    }
}
