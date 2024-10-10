import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê os valores de ponto flutuante A, B e C
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Calcula o discriminante (Delta)
        double delta = B * B - 4 * A * C;

        // Verifica se é possível calcular as raízes
        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            // Calcula as raízes usando a fórmula de Bhaskara
            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);

            // Exibe as raízes com 5 casas decimais
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }

        sc.close();
    }
}
