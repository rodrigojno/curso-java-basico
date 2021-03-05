package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio12 {
    public static void main (String []args){
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHoraTrabalhada = scan.nextDouble();
        
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double qtdeHoraTrabalhada = scan.nextDouble();
        
        double salarioBruto = valorHoraTrabalhada * qtdeHoraTrabalhada;
        
        int percentualIR = 0;
        if (salarioBruto <= 900){
            percentualIR = 0;
        }else if (salarioBruto > 900 && salarioBruto <= 1500){
            percentualIR = 5;
        }else if (salarioBruto > 1500 && salarioBruto <= 2500){
            percentualIR = 10;
        }else if (salarioBruto > 2500){
            percentualIR = 20;
        }
        
        double descontoIR = (salarioBruto /100 * percentualIR);
        double descontoINSS = (salarioBruto /100 * 10);
        double fgts = (salarioBruto /100 * 11);
        double totalDescontos = descontoIR + descontoINSS;
        double salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.println("Salario Bruto: (" + valorHoraTrabalhada + " * " + qtdeHoraTrabalhada + ")   : R$" + salarioBruto);
        System.out.println("(-) IR: (" + percentualIR + "%)                   : R$" + descontoIR);
        System.out.println("(-) INSS: (10%)                : R$" + descontoINSS);
        System.out.println("FGTS: (11%)                    : R$" + fgts);
        System.out.println("Total de descontos             : R$" + totalDescontos);
        System.out.println("Salário Líquido                : R$" + salarioLiquido);
    }
}
