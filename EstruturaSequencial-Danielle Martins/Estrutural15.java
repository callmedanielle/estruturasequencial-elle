import java.util.Scanner;

public class Estrutural15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor da hora trabalhada: ");
    double valorHora = sc.nextDouble();

    System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
    double horasTrabalhadas = sc.nextDouble();

    double salarioBruto = valorHora * horasTrabalhadas;
    double ir = 0.11 * salarioBruto;
    double inss = 0.08 * salarioBruto;
    double sindicato = 0.05 * salarioBruto;
    double totalDescontos = ir + inss + sindicato;
    double salarioLiquido = salarioBruto - totalDescontos;

    System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
    System.out.printf("Valor pago ao INSS: R$ %.2f%n", inss);
    System.out.printf("Valor pago ao Sindicato: R$ %.2f%n", sindicato);
    System.out.printf("Total de descontos: R$ %.2f%n", totalDescontos);
    System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

    sc.close();
  }
}
