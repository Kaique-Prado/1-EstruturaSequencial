import java.util.Scanner;

public class Ex3Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o 1° número: ");
        int numero1 = scanner.nextInt();
        System.out.println();
        
        System.out.print("Escreva o 2° número: ");
        int numero2 = scanner.nextInt();
        System.out.println();

        scanner.close();

        System.out.println("A soma dos números é: " + (numero1 + numero2));



    }
}
