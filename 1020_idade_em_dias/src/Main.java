import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o valor da idade em dias
        int dias = sc.nextInt();

        // Calcula anos, meses e dias
        int anos = dias / 365;
        dias %= 365;
        int meses = dias / 30;
        dias %= 30;

        // Exibe no formato anos, meses e dias
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        sc.close();
    }
}
