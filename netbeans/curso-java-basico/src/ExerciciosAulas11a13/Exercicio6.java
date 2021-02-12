package ExerciciosAulas11a13;
import java.util.Scanner;
import java.math.BigDecimal;
public class Exercicio6 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Informe o valor do raio do círculo: ");
        double raio = scan.nextDouble();
        double areaCirculo = Math.pow(raio, 2)*Math.PI;
        System.out.println("A área do círculo é: " + areaCirculo + "cm²");
        
    }
    
}
