import java.util.Scanner;

// Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

public class Estrutural2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        
        System.out.println("O número informado foi " + numero + ".");
    }
}
