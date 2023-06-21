import java.util.Scanner;
public class Ex14Peixe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque os quilos de peixe ");
        float peso = scanner.nextFloat();

        scanner.close();

        float excesso = peso - 50;
        float multa = excesso * 4;

        if(peso> 50) {
            System.out.println("O excesso de peso é: " + excesso +"Kg");
            System.out.println("A multa a pagar é: " + multa +"R$");
        } else {
            System.out.println("O peso dos peixes é "+ peso);
            System.out.println("Você não terá que pagar nenhuma multa");
        }

    }
}
