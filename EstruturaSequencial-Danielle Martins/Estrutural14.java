import java.util.Scanner;

public class Estrutural14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o peso de peixes pescados por João (em quilos): ");
        double peso = input.nextDouble();
        
        double excesso = 0.0;
        double multa = 0.0;
        if (peso > 50.0) {
            excesso = peso - 50.0;
            multa = excesso * 4.0;
        }
        
        System.out.println("Peso de peixes pescados: " + peso + "kg");
        if (excesso > 0.0) {
            System.out.println("Excesso de peso: " + excesso + "kg");
            System.out.println("Valor da multa: R$" + multa);
        } else {
            System.out.println("Não houve excesso de peso.");
        }
    }
}
