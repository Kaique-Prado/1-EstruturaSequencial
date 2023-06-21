import java.util.Scanner;
public class Ex15Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Quanto quanha por hora: ");
         float salarioHora = scanner.nextFloat();
	 System.out.println();

        System.out.print("Quantas horas você trabalha no mês: ");
        int horasMes = scanner.nextInt();
	System.out.println();
        scanner.close();
        
        float salarioBruto = salarioHora * horasMes;
        float inss = salarioBruto - salarioBruto +( salarioBruto * 8/100);
        float impostoRenda = salarioBruto - salarioBruto +( salarioBruto * 11/100);
        float sindicato = salarioBruto - salarioBruto +( salarioBruto * 5/100);
        float salarioLiquido = salarioBruto - (inss + impostoRenda + sindicato);

        System.out.println("Seu salário bruto é: " + salarioBruto);
	System.out.println("quanto pagou ao IR: "+ impostoRenda);
        System.out.println("quanto pagou ao INSS: "+ inss);
        System.out.println("quanto pagou ao sindicato: " + sindicato);
        System.out.println("Seu salario liquído é: " + salarioLiquido);


    }
}
