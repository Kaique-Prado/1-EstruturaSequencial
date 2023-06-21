import java.util.Scanner;
public class Ex6RaioCirculo {
    public static void main(String[] args) {
        float raio;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque o raio do Circulo: ");
        raio = scanner.nextFloat();
        System.out.println();

        scanner.close();

        double area = 3.14 * Math.pow(raio, 2);

        System.out.printf("A área do circulo de raio " + raio + " é: "+ "%.2f", area); 
       
    }
}
