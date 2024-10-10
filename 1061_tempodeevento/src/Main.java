import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da data e hora de início
        String diaInicio = scanner.nextLine(); // Exemplo: "Dia 5"
        int diaInicioNum = Integer.parseInt(diaInicio.split(" ")[1]); // Extrai o dia

        String horaInicio = scanner.nextLine(); // Exemplo: "08 : 12 : 23"
        String[] partesInicio = horaInicio.split(" : "); // Divide a hora, minuto e segundo
        int horaInicioNum = Integer.parseInt(partesInicio[0]);
        int minutoInicioNum = Integer.parseInt(partesInicio[1]);
        int segundoInicioNum = Integer.parseInt(partesInicio[2]);

        // Leitura da data e hora de término
        String diaFim = scanner.nextLine(); // Exemplo: "Dia 9"
        int diaFimNum = Integer.parseInt(diaFim.split(" ")[1]); // Extrai o dia

        String horaFim = scanner.nextLine(); // Exemplo: "06 : 13 : 23"
        String[] partesFim = horaFim.split(" : "); // Divide a hora, minuto e segundo
        int horaFimNum = Integer.parseInt(partesFim[0]);
        int minutoFimNum = Integer.parseInt(partesFim[1]);
        int segundoFimNum = Integer.parseInt(partesFim[2]);

        // Cálculo dos segundos totais desde a data base (1 de Abril, 00:00:00)
        long totalInicio = calcularTotalSegundos(diaInicioNum, horaInicioNum, minutoInicioNum, segundoInicioNum);
        long totalFim = calcularTotalSegundos(diaFimNum, horaFimNum, minutoFimNum, segundoFimNum);

        // Cálculo da duração
        long segundosTotais = totalFim - totalInicio;

        // Cálculo dos dias, horas, minutos e segundos
        long dias = segundosTotais / 86400; // 86400 segundos em um dia
        long horas = (segundosTotais % 86400) / 3600; // 3600 segundos em uma hora
        long minutos = (segundosTotais % 3600) / 60; // 60 segundos em um minuto
        long segundos = segundosTotais % 60; // Restante dos segundos

        // Saída formatada
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        scanner.close();
    }

    // Método para calcular o total de segundos desde o início de Abril
    private static long calcularTotalSegundos(int dia, int hora, int minuto, int segundo) {
        return ((dia - 1) * 86400) + (hora * 3600) + (minuto * 60) + segundo;
    }
}
