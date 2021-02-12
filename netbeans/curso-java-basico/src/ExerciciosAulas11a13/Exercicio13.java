package ExerciciosAulas11a13;
import java.util.Scanner;
public class Exercicio13 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite quanto você recebe por hora trabalhada:");
        double valorHoraTrabalhada = scan.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double qtdeHorasTrabalhadas = scan.nextDouble();
        double salarioBruto = valorHoraTrabalhada * qtdeHorasTrabalhadas;
        double INSS = salarioBruto * 0.08;
        double IRPF = (salarioBruto - INSS) * 0.11;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - INSS - IRPF - sindicato;
        System.out.println("O salário bruto é: R$" + salarioBruto);
        System.out.println("Desconto de INSS: R$" + INSS);
        System.out.println("Desconto de IRPF: R$" + IRPF);
        System.out.println("Desconto de sindicato: R$" + sindicato);
        System.out.println("O salário líquido é: R$" + salarioLiquido);
    }
}
