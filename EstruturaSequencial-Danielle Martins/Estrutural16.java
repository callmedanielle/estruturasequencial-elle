import java.util.Scanner;



public class Estrutural16 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double area, litrosNecessarios, latasNecessarias;
        final double LITROS_POR_METRO_QUADRADO = 1.0/3.0;
        final double PRECO_DA_LATA = 80.0;
        
        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        area = sc.nextDouble();
        
        // Cálculo dos litros de tinta necessários e das latas de tinta necessárias
        litrosNecessarios = area * LITROS_POR_METRO_QUADRADO;
        latasNecessarias = Math.ceil(litrosNecessarios / 18.0);
        
        // Cálculo do preço total das latas de tinta necessárias
        double precoTotal = latasNecessarias * PRECO_DA_LATA;
        
        // Exibição do resultado
        System.out.println("Quantidade de latas de tinta necessárias: " + latasNecessarias);
        System.out.println("Preço total das latas de tinta: R$ " + precoTotal);
        
        sc.close();
    }

}
