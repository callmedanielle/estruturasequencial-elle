import java.util.Scanner;

public class Estrutural3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = input.nextInt();
        
        int resultado = numero1 + numero2;
        System.out.println("A soma dos números é: " + resultado);
    }
}