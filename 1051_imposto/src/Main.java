import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Lê o salário
        double salario = scanner.nextDouble();
        double imposto = 0.0;

        // Calcula o Imposto de Renda
        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            imposto += (salario - 2000.00) * 0.08; // 8% sobre o que ultrapassar R$ 2000.00
            System.out.println("R$ " + df.format(imposto));
        } else if (salario <= 4500.00) {
            imposto += (1000.00 * 0.08); // 8% sobre R$ 1000.00
            imposto += (salario - 3000.00) * 0.18; // 18% sobre o que ultrapassar R$ 3000.00
            System.out.println("R$ " + df.format(imposto));
        } else {
            imposto += (1000.00 * 0.08); // 8% sobre R$ 1000.00
            imposto += (1500.00 * 0.18); // 18% sobre R$ 1500.00
            imposto += (salario - 4500.00) * 0.28; // 28% sobre o que ultrapassar R$ 4500.00
            System.out.println("R$ " + df.format(imposto));
        }

        scanner.close();
    }
}
