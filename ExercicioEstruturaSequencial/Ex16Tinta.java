import java.util.Scanner;
public class Ex16Tinta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o tamanho do espaço em m²: ");
        float area = scanner.nextFloat();

        scanner.close();

        float cobertura = area/ 6;
        float  quantidadeLatas = cobertura /18;
        float precoTotal = quantidadeLatas * 80;

        System.out.println("Quantidade de Latas a serem Compradas: " + quantidadeLatas);
        System.out.println("Preço Total: " + precoTotal);

        

    }
}
