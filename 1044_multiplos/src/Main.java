import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dois valores inteiros
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Verifica se A é múltiplo de B ou B é múltiplo de A
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
