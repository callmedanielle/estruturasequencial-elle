import java.util.Scanner;

public class Estrutural13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = input.nextDouble();
        
        System.out.print("Digite o sexo da pessoa (M para masculino ou F para feminino): ");
        char sexo = input.next().charAt(0);
        
        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido!");
            return;
        }
        
        System.out.println("O peso ideal para a pessoa de altura " + altura + "m e sexo " + sexo + " é: " + pesoIdeal + "kg");
    }
}
