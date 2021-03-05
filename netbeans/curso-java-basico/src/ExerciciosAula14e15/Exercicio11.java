package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio11 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o salário atual: ");
        double salarioAtual = scan.nextDouble();
        
        int percentual = 0;
        if (salarioAtual <= 280){
            percentual = 20;
        }else if (salarioAtual > 280 && salarioAtual < 700){
            percentual = 15;
        }else if (salarioAtual >= 700 && salarioAtual < 1500){
            percentual = 10;
        }else if (salarioAtual >= 1500){
            percentual = 5;
        }
        
        double aumento = (salarioAtual /100 * percentual);
        double salarioReajustado = salarioAtual + aumento;
        
        System.out.println("Salario antes do reajuste: R$" + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentual + "%");
        System.out.println("Valor do aumento aplicado: R$" + aumento);
        System.out.println("Novo salário, após o aumento: R$" + salarioReajustado);
        
        
        
        /*if (salarioAtual <= 280){
            double aumento20 = salarioAtual * 20/100;
            double salarioReajustado = salarioAtual + aumento20;
            System.out.println("Salario antes do reajuste: R$" + salarioAtual);
            System.out.println("Percentual de aumento aplicado: 20%");
            System.out.println("Valor do aumento aplicado: " + aumento20);
            System.out.println("Novo salário, após o aumento: R$" + salarioReajustado);
        }else if (salarioAtual > 280 && salarioAtual <= 700){
            double aumento15 = salarioAtual * 15/100;
            double salarioReajustado = salarioAtual + aumento15;
            System.out.println("Salario antes do reajuste: R$" + salarioAtual);
            System.out.println("Percentual de aumento aplicado: 15%");
            System.out.println("Valor do aumento aplicado: " + aumento15);
            System.out.println("Novo salário, após o aumento: R$" + salarioReajustado);
        }else if (salarioAtual > 700 && salarioAtual <= 1500){
            double aumento10 = salarioAtual * 10/100;
            double salarioReajustado = salarioAtual + aumento10;
            System.out.println("Salario antes do reajuste: R$" + salarioAtual);
            System.out.println("Percentual de aumento aplicado: 10%");
            System.out.println("Valor do aumento aplicado: " + aumento10);
            System.out.println("Novo salário, após o aumento: R$" + salarioReajustado);
        }else if (salarioAtual > 1500){
            double aumento5 = salarioAtual * 5/100;
            double salarioReajustado = salarioAtual + aumento5;
            System.out.println("Salario antes do reajuste: R$" + salarioAtual);
            System.out.println("Percentual de aumento aplicado: 5%");
            System.out.println("Valor do aumento aplicado: R$" + aumento5);
            System.out.println("Novo salário, após o aumento: R$" + salarioReajustado);
        }*/
        
    }
}
