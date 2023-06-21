import java.util.Scanner;
public class Ex4Media {
    public static void main(String[] args) {
        int[] notas = new int[4];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva a 1° nota bimestral: ");
        notas[0] = scanner.nextInt();
        System.out.println();

        System.out.print("Escreva a 2° nota bimestral: ");
        notas[1] = scanner.nextInt();
        System.out.println();

        System.out.print("Escreva a 3° nota bimestral: ");
        notas[2] = scanner.nextInt();
        System.out.println();

        System.out.print("Escreva a 4° nota bimestral: ");
        notas[3] = scanner.nextInt();
        System.out.println();
        scanner.close();

        int media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        System.out.println("A média é: " + media);


    }
}
