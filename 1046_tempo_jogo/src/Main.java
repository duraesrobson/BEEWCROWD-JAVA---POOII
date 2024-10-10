import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura da hora inicial e hora final
        int horaInicio = sc.nextInt();
        int horaFim = sc.nextInt();

        int duracao;

        // Cálculo da duração
        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFim;
        }

        // Exibindo a duração do jogo
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
