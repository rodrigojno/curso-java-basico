package ExerciciosAulas11a13;
import java.util.Scanner;
public class Exercicio14 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Informe o tamanho do arquivo (em MB) para download: ");
        double tamanhoArquivo = scan.nextDouble();
        System.out.println("Informe a velocidade de um link de Internet (em Mbps): ");
        double velocidadeInternet = scan.nextDouble();
        double tempoDownload = (tamanhoArquivo / velocidadeInternet);
        System.out.println("O tempo aproximado de download do arquivo usando este link é: " + tempoDownload + " minutos.");
    }
}
