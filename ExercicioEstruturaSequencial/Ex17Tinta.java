import java.util.Scanner;
public class Ex17Tinta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o tamanho do espaço em m²: ");
        float area = scanner.nextFloat();

        float cobertura = area/ 6;
        float  quantidadeLatas = cobertura /18;
        double quantidadeGaloes = cobertura / 3.6;
        float precoLatas = quantidadeLatas * 80;
        double precoGaloes = quantidadeGaloes * 25; 
        double precoTotal = precoLatas + precoGaloes;

        double[] mistura = {quantidadeLatas, quantidadeGaloes, precoTotal};
         int quantidadeLatasMistura = (int) mistura[0];
         int quantidadeGaloesMistura = (int) mistura[1];
        double precoTotalMistura = mistura[2];

        scanner.close();

        System.out.println("Situação 1: Comprar apenas latas de 18 litros");
        System.out.println("Quantidade de latas: " + quantidadeLatas);
        System.out.println("Preço total: R$" + precoLatas);

        System.out.println("\nSituação 2: Comprar apenas galões de 3,6 litros");
        System.out.println("Quantidade de galões: " + quantidadeGaloes);
        System.out.println("Preço total: R$" + precoGaloes);

        System.out.println("\nSituação 3: Misturar latas e galões");
        System.out.println("Quantidade de latas: " + quantidadeLatasMistura);
        System.out.println("Quantidade de galões: " + quantidadeGaloesMistura);
        System.out.println("Preço total: R$" + precoTotalMistura);




    }
}