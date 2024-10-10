import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o valor em segundos
        int N = sc.nextInt();
        
        // Calcula horas, minutos e segundos
        int horas = N / 3600;
        int minutos = (N % 3600) / 60;
        int segundos = N % 60;

        // Exibe no formato horas:minutos:segundos
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

        sc.close();
    }
}
