package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio14 {
    public static void main (String[] args){
        
       Scanner scan = new Scanner (System.in);
        
       System.out.println("Digite a primeira nota: ");
       double nota1 = scan.nextDouble();
       System.out.println("Digite a segunda nota: ");
       double nota2 = scan.nextDouble();
       
       double mediaNota = (nota1 + nota2) / 2;
       String conceito = "";
       
       if (mediaNota >= 0 && mediaNota < 4){
           conceito = "E";
       }else if (mediaNota >= 4 && mediaNota < 6){
           conceito = "D";
       }else if (mediaNota >= 6 && mediaNota < 7.5){
           conceito = "C";
       }else if (mediaNota >= 7.5 && mediaNota < 9){
           conceito = "B";
       }else if (mediaNota >= 9 && mediaNota <= 10){
           conceito = "A";
       }
       
       System.out.println("Nota 1: " + nota1);
       System.out.println("Nota 2: " + nota2);
       System.out.println("Nota média: " + mediaNota);
       System.out.println("Conceito: " + conceito);
       
       if (conceito == "A" && conceito == "B" && conceito == "C"){
           System.out.println("APROVADO");
       } else {
           System.out.println("REPROVADO");
       }      
    }
}
