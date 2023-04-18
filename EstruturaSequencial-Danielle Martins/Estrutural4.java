import java.util.Scanner;

// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

public class Estrutural4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, nota3, nota4, soma, media;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        nota4 = sc.nextDouble();
        
        // Cálculo da soma das notas e da média
        soma = nota1 + nota2 + nota3 + nota4;
        media = soma / 4;
        
        // Exibição do resultado
        System.out.println("A soma das notas é: " + soma);
        System.out.println("A média das notas é: " + media);
        
        sc.close();
    }

}