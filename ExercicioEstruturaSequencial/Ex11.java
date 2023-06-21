import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o 1° número inteiro:");
        int numero1 = scanner.nextInt();
        System.out.println();
        System.out.print("Escreva o 2° número inteiro: ");
        int numero2 = scanner.nextInt();
        System.out.println();
        System.out.print("Escreva um número real: ");
        float numeroReal = scanner.nextFloat();
        System.out.println();

        scanner.close();

        //o produto do dobro do primeiro com metade do segundo.
        int produto = (2*numero1) + (2/numero2);
        //a soma do triplo do primeiro com o terceiro.
        float soma = (3*numero1) + numeroReal;
        //o terceiro elevado ao cubo.
        double cubo = Math.pow(numeroReal, 3);

        System.out.println("o produto do dobro do primeiro com metade do segundo: " + produto);
        System.out.println("a soma do triplo do primeiro com o terceiro: " + soma);
        System.out.printf("o terceiro elevado ao cubo: "+ "%.2f", cubo);
    }
}
