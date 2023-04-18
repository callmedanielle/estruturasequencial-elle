import java.util.Scanner;

// Faça um Programa que converta metros para centímetros.

public class Estrutural5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variáveis
        double metros;
        double centimetros;

        // Entrada de dados
        System.out.print("Insira um valor em metros: ");
        metros = input.nextDouble();

        // Converter metros em centímetros
        centimetros = metros * 100;

        // Exibir a resposta para o usuário
        System.out.println("O valor informado convertido para centímetros é " + centimetros);

        input.close();
    }
}
