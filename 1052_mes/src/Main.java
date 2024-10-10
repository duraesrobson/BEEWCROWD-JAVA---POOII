import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê o número do mês
        int mes = scanner.nextInt();
        String nomeDoMes;

        // Verifica o número do mês e atribui o nome correspondente
        switch (mes) {
            case 1:
                nomeDoMes = "January";
                break;
            case 2:
                nomeDoMes = "February";
                break;
            case 3:
                nomeDoMes = "March";
                break;
            case 4:
                nomeDoMes = "April";
                break;
            case 5:
                nomeDoMes = "May";
                break;
            case 6:
                nomeDoMes = "June";
                break;
            case 7:
                nomeDoMes = "July";
                break;
            case 8:
                nomeDoMes = "August";
                break;
            case 9:
                nomeDoMes = "September";
                break;
            case 10:
                nomeDoMes = "October";
                break;
            case 11:
                nomeDoMes = "November";
                break;
            case 12:
                nomeDoMes = "December";
                break;
            default:
                nomeDoMes = ""; // Não deve chegar aqui, pois a entrada deve estar entre 1 e 12
                break;
        }

        // Imprime o nome do mês
        if (!nomeDoMes.isEmpty()) {
            System.out.println(nomeDoMes);
        }
        
        scanner.close();
    }
}
