package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio18 {
    public static void main (String[] args){
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();
        
        if (num == 0){
            System.out.println("O número digitado é neutro!");
        }else{
            if (num % 2 == 0){
            System.out.println("O número digitado é par.");
        }else{
            System.out.println("O número digitado é impar.");
        }    
        }
    }
}
