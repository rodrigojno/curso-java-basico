package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio17 {
    public static void main (String[] args){
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite um ano para saber se é ano bissexto: ");
        int ano = scan.nextInt();
        
        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("O ano é bissexto!");
        }else{
            System.out.println("O ano não é um ano bissexto!");
        }
        
        /*int restoAno4 = ano % 4;
        int restoAno100 = ano % 100;
        int restoAno400 = ano % 400;
        
        if (restoAno4 == 0){
            if (restoAno100 == 0){
                if(restoAno400 == 0){
                    System.out.println("O ano é bissexto!");
                }else{
                    System.out.println("O ano não é um ano bissexto!");
                }
            }else{
                System.out.println("O ano é bissexto!");
            }
        }else{
                System.out.println("O ano não é um ano bissexto!");
        }*/
    }
}
