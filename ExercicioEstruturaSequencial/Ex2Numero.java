import java.util.Scanner;

public class Ex2Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int numero = scanner.nextInt();
        scanner.close();
        
        System.out.println("O número informado foi: " + numero);
    }
    
}