import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura da hora inicial, minuto inicial, hora final e minuto final
        int horaInicio = sc.nextInt();
        int minutoInicio = sc.nextInt();
        int horaFim = sc.nextInt();
        int minutoFim = sc.nextInt();

        // Cálculo da duração
        int duracaoHoras, duracaoMinutos;

        // Convertendo tudo para minutos para facilitar o cálculo
        int totalInicio = horaInicio * 60 + minutoInicio;
        int totalFim = horaFim * 60 + minutoFim;

        // Se a hora final e minuto final são menores que a hora e minuto inicial, 
        // isso significa que o jogo terminou no dia seguinte
        if (totalFim <= totalInicio) {
            totalFim += 24 * 60; // Adiciona um dia (24 horas) em minutos
        }

        // Calculando a duração total em minutos
        int duracaoTotal = totalFim - totalInicio;

        // Convertendo a duração total de volta para horas e minutos
        duracaoHoras = duracaoTotal / 60;
        duracaoMinutos = duracaoTotal % 60;

        // Exibindo a duração do jogo
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHoras, duracaoMinutos);

        sc.close();
    }
}
