import java.util.Scanner;
public class Ex8Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto quanha por hora: ");
        float salarioHora = scanner.nextFloat();

        System.out.println("Quantas horas você trabalha no mês: ");
        int horasMes = scanner.nextInt();
        scanner.close();
        
        float salario = salarioHora * horasMes;

        System.out.println("Seu salário é: " + salario);
    }
}
