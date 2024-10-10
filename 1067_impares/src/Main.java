import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt(); // Lê o valor de X

        // Loop para imprimir os números ímpares de 1 até X
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) { // Verifica se i é ímpar
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
