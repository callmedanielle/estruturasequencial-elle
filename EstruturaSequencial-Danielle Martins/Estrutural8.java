import java.util.Scanner;

// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

public class Estrutural8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double valorHora, salario;
        int horasTrabalhadas;
        
        System.out.print("Digite o valor da hora trabalhada: ");
        valorHora = sc.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horasTrabalhadas = sc.nextInt();
        
        // Cálculo do salário
        salario = valorHora * horasTrabalhadas;
        
        // Exibição do resultado
        System.out.println("O seu salário no mês é R$ " + salario);
        
        sc.close();
    }

}