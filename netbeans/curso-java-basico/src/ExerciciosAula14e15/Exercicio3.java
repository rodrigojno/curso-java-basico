package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio3 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite F para feminino e M para masculino: ");
        String sexo = scan.next();
        if (sexo.equalsIgnoreCase("f")){
            System.out.println("F - Feminino");
        }else if (sexo.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        }else
            System.out.println("Sexo inválido!");
    }
}
