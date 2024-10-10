import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt(); // Lê o valor de X
        int count = 0; // Contador de valores ímpares impressos

        // Ajusta X se for par para começar a partir do próximo ímpar
        if (x % 2 == 0) {
            x++; // Se X é par, começamos a partir do próximo ímpar
        }

        // Loop para imprimir 6 valores ímpares consecutivos
        while (count < 6) {
            System.out.println(x); // Imprime o valor ímpar
            x += 2; // Passa para o próximo ímpar
            count++; // Incrementa o contador
        }

        scanner.close();
    }
}
