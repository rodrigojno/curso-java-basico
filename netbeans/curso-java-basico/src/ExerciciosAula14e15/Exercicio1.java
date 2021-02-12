package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio1 {
        public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();
        if (num1 > num2){
            System.out.println("O maior número é: " + num1);
    }else {
        System.out.println("O maior número é: " + num2);
            }
    }
}
