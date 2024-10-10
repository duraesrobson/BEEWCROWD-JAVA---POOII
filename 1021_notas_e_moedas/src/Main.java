import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o valor monetário
        double valor = sc.nextDouble();

        // Converte o valor para centavos para evitar problemas de precisão com ponto flutuante
        int centavos = (int) Math.round(valor * 100);

        // Notas disponíveis
        int[] notas = {10000, 5000, 2000, 1000, 500, 200}; // em centavos
        String[] notasFormatadas = {"R$ 100.00", "R$ 50.00", "R$ 20.00", "R$ 10.00", "R$ 5.00", "R$ 2.00"};
        int[] quantidadeNotas = new int[6];

        // Calcula a quantidade de notas
        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = centavos / notas[i];
            centavos %= notas[i];
        }

        // Moedas disponíveis
        int[] moedas = {100, 50, 25, 10, 5, 1}; // em centavos
        String[] moedasFormatadas = {"R$ 1.00", "R$ 0.50", "R$ 0.25", "R$ 0.10", "R$ 0.05", "R$ 0.01"};
        int[] quantidadeMoedas = new int[6];

        // Calcula a quantidade de moedas
        for (int i = 0; i < moedas.length; i++) {
            quantidadeMoedas[i] = centavos / moedas[i];
            centavos %= moedas[i];
        }

        // Imprime o resultado
        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(quantidadeNotas[i] + " nota(s) de " + notasFormatadas[i]);
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++) {
            System.out.println(quantidadeMoedas[i] + " moeda(s) de " + moedasFormatadas[i]);
        }

        sc.close();
    }
}
