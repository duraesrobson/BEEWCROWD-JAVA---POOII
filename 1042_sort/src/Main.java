import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos três valores inteiros
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Armazenar os valores em um array
        int[] valores = {a, b, c};
        int[] ordenados = {a, b, c};

        // Ordenar os valores
        Arrays.sort(ordenados);

        // Imprimir os valores em ordem crescente
        for (int valor : ordenados) {
            System.out.println(valor);
        }

        // Linha em branco
        System.out.println();

        // Imprimir os valores na ordem original
        for (int valor : valores) {
            System.out.println(valor);
        }

        sc.close();
    }
}
