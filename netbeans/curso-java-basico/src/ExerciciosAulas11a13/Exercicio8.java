package ExerciciosAulas11a13;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite quanto você recebe por hora trabalhada: ");
        double valorPorHora = scan.nextDouble();
        System.out.println("Digite quantas horas você trabalha no mês: ");
        double qtdeHorasTrabalhadasMes = scan.nextDouble();
        double salarioMensal = valorPorHora * qtdeHorasTrabalhadasMes;
        System.out.println("O total do salário no mês é: R$" + salarioMensal);
    }
    
}
