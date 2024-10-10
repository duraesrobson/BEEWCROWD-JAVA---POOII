import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countPares = 0;      // Contador de valores pares
        int countImpares = 0;    // Contador de valores ímpares
        int countPositivos = 0;  // Contador de valores positivos
        int countNegativos = 0;   // Contador de valores negativos

        // Lê 5 valores inteiros
        for (int i = 0; i < 5; i++) {
            int valor = scanner.nextInt();
            
            // Verifica se o valor é par ou ímpar
            if (valor % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
            
            // Verifica se o valor é positivo ou negativo
            if (valor > 0) {
                countPositivos++;
            } else if (valor < 0) {
                countNegativos++;
            }
        }

        // Saída formatada
        System.out.println(countPares + " valor(es) par(es)");
        System.out.println(countImpares + " valor(es) impar(es)");
        System.out.println(countPositivos + " valor(es) positivo(s)");
        System.out.println(countNegativos + " valor(es) negativo(s)");

        scanner.close();
    }
}
