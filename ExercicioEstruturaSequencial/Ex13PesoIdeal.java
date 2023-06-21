import java.util.Scanner;
public class Ex13PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua altura: ");
        float altura = scanner.nextFloat();

        System.out.println("Você é Homem ou Mulher, responda 1 para homem ou 2 para mulher");
        int genero = scanner.nextInt();
        scanner.close();
        switch(genero) {
            case 1: 
                double pesoIdeal = (72.7 * altura) - 58;
                System.out.println("Seu peso ideal é " +  pesoIdeal);
                break;
            case 2:
                pesoIdeal = (62.1*altura) - 44.7;
                System.out.println("Seu peso ideal é " +  pesoIdeal);
                break;
            default:
                System.out.println("Entrada inválida");
        }
        
    }
}
