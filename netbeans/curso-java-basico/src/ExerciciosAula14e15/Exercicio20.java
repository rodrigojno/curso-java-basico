package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio20 {
    public static void main (String[] args){
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Telefonou para a vítima? (S/N): ");
        String resposta1 = scan.next();
        System.out.println("Esteve no local do crime? (S/N): ");
        String resposta2 = scan.next();
        System.out.println("Mora perto da vítima? (S/N): ");
        String resposta3 = scan.next();
        System.out.println("Devia para a vítima? (S/N): ");
        String resposta4 = scan.next();
        System.out.println("Já trabalhou com a vítima? (S/N): ");
        String resposta5 = scan.next();
        
        int cont = 0;
        
        if (resposta1.equalsIgnoreCase("S")){
            cont++;
        }
        if (resposta2.equalsIgnoreCase("S")){
            cont++;
        }
        if (resposta3.equalsIgnoreCase("S")){
            cont++;
        }       
        if (resposta4.equalsIgnoreCase("S")){
            cont++;
        }        
        if (resposta5.equalsIgnoreCase("S")){
            cont++;
        }        
        
        if (cont == 2){
                System.out.println("É suspeito");
        }else if (cont == 3 || cont == 4){
                System.out.println("É cúmplice");
        }else if (cont == 5){
                System.out.println("É assassino.");
        }else {
            System.out.println("É inocente.");
        }
    }
}