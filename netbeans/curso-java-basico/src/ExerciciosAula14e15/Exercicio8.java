package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o preço do produto 1: ");
        double produto1 = scan.nextDouble();
        System.out.println("Digite o preço do produto 2: ");
        double produto2 = scan.nextDouble();
        System.out.println("Digite o preço do produto 3: ");
        double produto3 = scan.nextDouble();
        if (produto1 > produto2 && produto2 > produto3){
        System.out.println("O produto a ser adquirido e de menor valor é o terceiro: R$" + produto3);
    }else if (produto1 > produto2 && produto2 < produto3 && produto1 > produto3){
        System.out.println("O produto a ser adquirido e de menor valor é o segundo: R$" + produto2);
    }else if(produto1 < produto2 && produto2 > produto3 && produto1 > produto3){
        System.out.println("O produto a ser adquirido e de menor valor é o terceiro: R$" + produto3);
    }else if(produto1 > produto2 && produto2 < produto3 && produto1 < produto3){
        System.out.println("O produto a ser adquirido e de menor valor é o segundo: R$" + produto2);
    }else if (produto1 < produto2 && produto2 > produto3 && produto1 < produto3){
        System.out.println("O produto a ser adquirido e de menor valor é o primeiro: R$" + produto1);
    }else if (produto1 < produto2 && produto2 < produto3){
        System.out.println("O produto a ser adquirido e de menor valor é o primeiro: R$" + produto1);
    }else if (produto1 == produto2 && produto2 > produto3){
        System.out.println("O produto a ser adquirido e de menor valor é o terceiro: R$" + produto3);
    }else if (produto1 == produto2 && produto2 == produto3){
        System.out.println("Qualquer produto pode ser adquirido, pois todos têm o mesmo valor: produto 1 R$" + produto1 + "; produto 2 R$" + produto2 + "; produto 3 R$" + produto3);
    }else if (produto1 == produto2 && produto2 < produto3){
        System.out.println("Os produtos a serem adquiridos e de menor valor é o primeiro: R$" + produto1 + " e o segundo: R$" + produto2);
    }else if (produto1 < produto2 && produto2 == produto3){
        System.out.println("O produto a ser adquirido e de menor valor é o primeiro: R$" + produto1);
    }else if (produto1 > produto2 && produto2 == produto3){
        System.out.println("Os produtos a serem adquiridos e de menor valor é o segundo: R$" + produto2 + " e o terceiro: R$" + produto3); 
    }else if (produto1 < produto2 && produto2 > produto3 && produto1 == produto3){
        System.out.println("Os produtos a serem adquiridos e de menor valor é o primeiro: R$" + produto1 + " e o terceiro: R$" + produto3); 
    }else if (produto1 > produto2 && produto2 < produto3 && produto1 == produto3){
        System.out.println("O produto a ser adquirido e de menor valor é o segundo: R$" + produto2); 
    }
    }
    
}
