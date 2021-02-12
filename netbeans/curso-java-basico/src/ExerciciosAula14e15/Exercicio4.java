package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio4 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite uma letra: ");
        String letra = scan.next();
       /* if ((letra.equalsIgnoreCase("a")) || (letra.equalsIgnoreCase("e")) || (letra.equalsIgnoreCase("i")) || (letra.equalsIgnoreCase("o")) || (letra.equalsIgnoreCase("u"))) {
            System.out.println("A letra digitada é vogal");
    }else {
            System.out.println("A letra digitada é consoante!");
            }*/
       
       switch(letra){
           case "a":
           case "e":
           case "i":
           case "o":
           case "u":
           case "A":
           case "E":
           case "I":
           case "O":
           case "U": System.out.println("A letra digitada é vogal");break;
           default: System.out.println("A letra digitada é consoante");
       }
    }
}
