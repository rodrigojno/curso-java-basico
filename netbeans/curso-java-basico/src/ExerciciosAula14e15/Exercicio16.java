package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio16 {
    public static void main (String[] args){
        
        Scanner scan = new Scanner (System.in);
      
        System.out.println("Cálculo da equação ax²+bx+c");
        System.out.println("Digite o valor de a: ");
        double valorA = scan.nextDouble();

            if (valorA == 0){
            System.out.println("Não é uma equação do segundo grau.");
        }else {
        System.out.println("Digite o valor de b: ");
        double valorB = scan.nextDouble();      
        System.out.println("Digite o valor de c: ");
        double valorC = scan.nextDouble(); 
        
        double delta = ((valorB * valorB) - (4 * valorA * valorC));
            if (delta < 0){
            System.out.println("A equação não possui raizes reais.");
            }else if (delta == 0){
                double valorX1 = (-valorB)/(2 * valorA);
                System.out.println("x = " + valorX1);
            } else if (delta > 0){
                double valorX1 = ((-valorB) + Math.sqrt (delta)) / (2 * valorA);
                double valorX2 = ((-valorB) - Math.sqrt (delta)) / (2 * valorA);
                System.out.println("x1 = " + valorX1 + " e x2 = " + valorX2);
            }
        }
        

    }
}
