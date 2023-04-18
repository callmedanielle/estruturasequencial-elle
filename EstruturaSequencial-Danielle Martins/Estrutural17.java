import java.util.Scanner;

public class Estrutural17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o tamanho em metros quadrados da área a ser pintada: ");
        double area = input.nextDouble();
        
        double litros = area / 6.0;
        double folga = litros * 0.1;
        double totalLitros = litros + folga;
        
        int latas = (int) Math.ceil(totalLitros / 18.0);
        int galoes = (int) Math.ceil(totalLitros / 3.6);
        
        double precoLatas = latas * 80.0;
        double precoGaloes = galoes * 25.0;
        
        // Misturando latas e galões
        int latasMisturadas = (int) Math.floor(totalLitros / 18.0);
        double litrosRestantes = totalLitros - (latasMisturadas * 18.0);
        int galoesMisturados = (int) Math.ceil(litrosRestantes / 3.6);
        
        double precoMistura = (latasMisturadas * 80.0) + (galoesMisturados * 25.0);
        
        System.out.println("Para pintar uma área de " + area + " metros quadrados, serão necessários:");
        System.out.println(latas + " latas de 18 litros de tinta, ao custo de R$ " + precoLatas);
        System.out.println(galoes + " galões de 3,6 litros de tinta, ao custo de R$ " + precoGaloes);
        System.out.println(latasMisturadas + " latas de 18 litros e " + galoesMisturados + " galões de 3,6 litros de tinta, ao custo de R$ " + precoMistura);
        
        input.close();
    }
}
