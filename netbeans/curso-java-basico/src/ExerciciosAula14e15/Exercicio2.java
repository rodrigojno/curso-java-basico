package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio2 {
    public static void main (String[] args){
        Scanner scan  = new Scanner (System.in);
        System.out.println("Digite um número: ");
        double num1 = scan.nextDouble();
        if(num1 > 0){
            System.out.println("O número digitado é positivo!");
        } else if (num1 < 0){
            System.out.println("O número digitado é negativo!");
        }else{
            System.out.println("O número digitado não é positivo e não é negativo!");
        }
    }
}
