import java.util.Scanner;
class Ex7AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque o valor do Lado do Quadrado: ");
        float lado = scanner.nextFloat();

        double area = Math.pow(lado , 2);
        double dobro = area * 2;

        scanner.close();

        System.out.printf("A area do quadrado é: "+ "%.2f", area);
        System.out.printf("\n" + "O dobro da área é: "+ "%.2f", dobro);
    }
}