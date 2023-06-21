import java.util.Scanner;
public class Ex18Arquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o tamanho do arquivo em MB: ");
        float tamanho = scanner.nextInt();
        System.out.println();

        System.out.print("Qual é a velocidade do link de internet em Mbps: ");
        float velocidade = scanner.nextFloat();

        scanner.close();

        float tempoDownloadMinutos = (tamanho / (velocidade/8))/60;
        float tempoDownloadSegundos = (tamanho / (velocidade/8)) % 60;

        System.out.printf("O tempo de download ira ser de " + "%.0f", tempoDownloadMinutos);
        System.out.printf(" minutos " + "%.0f", tempoDownloadSegundos);
        System.out.println(" segundos");
        
    }
}
