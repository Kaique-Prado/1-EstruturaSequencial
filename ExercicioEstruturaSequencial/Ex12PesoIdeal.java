import java.util.Scanner;
public class Ex12PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque sua altura: ");
        float altura = scanner.nextFloat();

        scanner.close();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.printf("Seu peso ideal é: "+ "%.2f", pesoIdeal);

    }
}
