package ExerciciosAulas11a13;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite a primeira nota bimestral: ");
        double notaBimestral1 = scan.nextDouble();
        System.out.println("Digite a segunda nota bimestral: ");
        double notaBimestral2 = scan.nextDouble();
        System.out.println("Digite a terceira nota bimestral: ");
        double notaBimestral3 = scan.nextDouble();
        System.out.println("Digite a quarta nota bimestral: ");
        double notaBimestral4 = scan.nextDouble();
        
        double media = (notaBimestral1 + notaBimestral2 + notaBimestral3 + notaBimestral4)/4;
        System.out.println("A média é: " + media);
    }
    
}
