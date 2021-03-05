package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio22 {
    public static void main (String[] args){
        
        Scanner scan = new Scanner (System.in);
        double qtdeTotal = 0;
        double pagamentoMorango = 0;
        double pagamentoMaca = 0;
        double pagamentoTotal = 0;
        
        System.out.println("Digite quantos quilos de morangos foram vendidos: ");
        double qtdeMorango = scan.nextDouble();
        System.out.println("Digite quantos quilos de maçãs foram vendidos: ");
        double qtdeMaca = scan.nextDouble();
        
        if (qtdeMorango <= 5){
            pagamentoMorango = qtdeMorango * 2.5;
        }else{
            pagamentoMorango = qtdeMorango * 2.2;
        }
        
        if (qtdeMaca <= 5){
            pagamentoMaca = qtdeMaca * 1.8;
        }else{
            pagamentoMaca = qtdeMaca * 1.5;
        }
        
        qtdeTotal = qtdeMorango + qtdeMaca;
        pagamentoTotal = pagamentoMorango + pagamentoMaca;
        
        if (qtdeTotal > 8 || pagamentoTotal > 25){
            pagamentoTotal = pagamentoTotal * 0.90;
        }
        
        System.out.println("Valor total a pagar: R$" + pagamentoTotal);
   
    }
}