import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o código do item e a quantidade
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        // Declara a variável para armazenar o preço total
        double total = 0.0;

        // Verifica o código e define o valor do item
        switch (codigo) {
            case 1:
                total = 4.00 * quantidade;
                break;
            case 2:
                total = 4.50 * quantidade;
                break;
            case 3:
                total = 5.00 * quantidade;
                break;
            case 4:
                total = 2.00 * quantidade;
                break;
            case 5:
                total = 1.50 * quantidade;
                break;
            default:
                System.out.println("Código inválido");
                break;
        }

        // Se o código for válido, exibe o valor total com 2 casas decimais
        if (total > 0) {
            System.out.printf("Total: R$ %.2f\n", total);
        }

        sc.close();
    }
}
