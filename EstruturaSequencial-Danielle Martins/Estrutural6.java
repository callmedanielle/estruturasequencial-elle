import java.util.Scanner;

public class Estrutural6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o raio do círculo: ");
        double raio = input.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
    }
}
