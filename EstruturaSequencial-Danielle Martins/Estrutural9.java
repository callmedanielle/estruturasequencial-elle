import java.util.Scanner;

// Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
// C = 5 * ((F-32) / 9).

public class Estrutural9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        
        // Cálculo da temperatura em Celsius
        double celsius = 5 * ((fahrenheit - 32) / 9);
        
        System.out.printf("A temperatura em graus Celsius é: %.2f", celsius);
        
        sc.close();
    }
}