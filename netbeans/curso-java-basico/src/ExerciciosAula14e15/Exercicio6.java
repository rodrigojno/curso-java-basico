package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio6 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = scan.nextDouble();
        if (num1 > num2 && num2 > num3){
        System.out.println("O maior número digitado é o primeiro número: " + num1);
    }else if (num1 < num2 && num2 > num3){
        System.out.println("O maior número digitado é o segundo número: " + num2);
    }else {
        System.out.println("O maior número digitado é o terceiro número: " + num3);
    }
    }
}
