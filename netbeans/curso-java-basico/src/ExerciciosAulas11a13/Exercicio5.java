package ExerciciosAulas11a13;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);    
        System.out.println("Informe o valor em metros a ser convertido para centímetros: ");
        double valor1 = scan.nextDouble();
        double centimetros = valor1*100;
        System.out.println("O valor é de: " + centimetros + "cm");
    }
       
}
