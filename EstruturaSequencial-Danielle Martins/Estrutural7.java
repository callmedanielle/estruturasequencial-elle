import java.util.Scanner;

public class Estrutural7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o lado do quadrado: ");
        double lado = input.nextDouble();
        
        double area = Math.pow(lado, 2);
        double dobroArea = 2 * area;
        
        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + dobroArea);
    }
}
