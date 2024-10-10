import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos três valores reais
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Verifica se os valores podem formar um triângulo
        if (A + B > C && A + C > B && B + C > A) {
            // Se for um triângulo, calcula o perímetro
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            // Se não for um triângulo, calcula a área do trapézio
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", area);
        }

        sc.close();
    }
}
