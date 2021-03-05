package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio21 {
    public static void main (String[] args){
        
        Scanner scan = new Scanner (System.in);
        
        double precoGasolina = 2.5;
        double precoAlcool = 1.9;
        double pagamentoAlcool = 0;
        double pagamentoGasolina = 0;
        double pagamentoTotal = 0;
        
        System.out.println("Digite quantos litros de gasolina foram vendidos: ");
        double qtdeGasolina = scan.nextDouble();
        System.out.println("Digite quantos litros de álcool foram vendidos: ");
        double qtdeAlcool = scan.nextDouble();
        
        if (qtdeAlcool < 20){
            pagamentoAlcool = qtdeAlcool * precoAlcool * 0.97;
        }else{
            pagamentoAlcool = qtdeAlcool * precoAlcool * 0.95;
        }
        
        if (qtdeGasolina < 20){
            pagamentoGasolina = qtdeGasolina * precoGasolina * 0.96;
        }else{
            pagamentoGasolina = qtdeGasolina * precoGasolina * 0.94;
        }
        
        pagamentoTotal = pagamentoAlcool + pagamentoGasolina;
        
        System.out.println("Quantidade de litros vendidos: A-álcool " + qtdeAlcool + "l");
        System.out.println("Quantidade de litros vendidos: G-gasolina " + qtdeGasolina + "l");
        System.out.println("Valor a pagar: A-álcool R$" + pagamentoAlcool);
        System.out.println("Valor a pagar: G-gasolina R$" + pagamentoGasolina);
        System.out.println("Valor total a pagar: R$" + pagamentoTotal);
    }
}