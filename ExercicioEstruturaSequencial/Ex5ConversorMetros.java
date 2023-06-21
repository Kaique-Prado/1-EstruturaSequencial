import java.util.Scanner;
public class Ex5ConversorMetros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escrava um valor em métros: ");
        float metros = scanner.nextFloat();
        scanner.close();

        float centimetros = metros * 100;

        System.out.println("A quantidade de métros em centimetros é: " + centimetros + " Cm");
    }
}
