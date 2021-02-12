package ExerciciosAulas11a13;
import java.util.Scanner;
public class Exercicio11 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um número inteiro: ");
        double num1 = scan.nextInt();
        System.out.println("Digite mais um número inteiro: ");
        double num2 = scan.nextInt();
        System.out.println("Digite um número real: ");
        double num3 = scan.nextDouble();
        double produtoDobroNum1MetadeNum2 = (num1 * 2) * (num2 / 2);
        double somaTriploNum1Num3 = (num1 * 3) + num3;
        double cubonum3 = Math.pow(num3, 3);
        System.out.println("O produto do dobro do primeiro com a metade do segundo é: " + produtoDobroNum1MetadeNum2);
        System.out.println("A soma do triplo do primeiro número com o terceiro número é: " + somaTriploNum1Num3);
        System.out.println("O terceiro número elevado ao cubo é: " + cubonum3);
    }
}
