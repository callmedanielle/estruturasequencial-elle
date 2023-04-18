import java.util.Scanner;

public class Estrutural18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo em MB: ");
        double tamanhoArquivo = sc.nextDouble();

        System.out.print("Digite a velocidade de download em Mbps: ");
        double velocidadeDownload = sc.nextDouble();

        double tempoSegundos = tamanhoArquivo / (velocidadeDownload / 8);
        double tempoMinutos = tempoSegundos / 60;

        System.out.printf("O tempo aproximado de download é de %.2f minutos.%n", tempoMinutos);
    }
}
