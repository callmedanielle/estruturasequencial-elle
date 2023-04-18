import java.util.Scanner;

public class Estrutural12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = input.nextDouble();
        
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("O peso ideal para a pessoa de altura " + altura + "m é: " + pesoIdeal + "kg");
    }
}
