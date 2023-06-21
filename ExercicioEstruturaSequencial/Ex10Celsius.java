import java.util.Scanner;

public class Ex10Celsius {
    public static void main(String[] args) {
        double F,C;
        //abrindo o Scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("MEDIDOR DE TEMPERATURAS \n" );
        System.out.printf("Escreva sua temperatura em Celsius: ");
        C= scanner.nextFloat();
        //fechando o Scanner
        scanner.close();
        //Calculo para a conversão de Fahrenheit para Celsius
        F= (C * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + F);
        
    }
}
