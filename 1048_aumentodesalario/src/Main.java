import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leitura do salário do funcionário
        double salario = sc.nextDouble();
        
        double novoSalario = 0.0;
        double reajusteGanho = 0.0;
        int percentualReajuste = 0;

        // Determinação do percentual de reajuste
        if (salario >= 0 && salario <= 400.00) {
            percentualReajuste = 15;
        } else if (salario <= 800.00) {
            percentualReajuste = 12;
        } else if (salario <= 1200.00) {
            percentualReajuste = 10;
        } else if (salario <= 2000.00) {
            percentualReajuste = 7;
        } else {
            percentualReajuste = 4;
        }
        
        // Cálculo do reajuste e do novo salário
        reajusteGanho = salario * percentualReajuste / 100;
        novoSalario = salario + reajusteGanho;

        // Exibindo os resultados
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
        System.out.printf("Em percentual: %d %%\n", percentualReajuste);

        sc.close();
    }
}
