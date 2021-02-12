package ExerciciosAulas11a13;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o valor do lado do quadrado: ");
        double ladoQuadrado = scan.nextDouble();
        double area = Math.pow(ladoQuadrado, 2);
        double dobroAreaQuadrado = area*2;
        System.out.println("O dobro da área do quadrado é: " + dobroAreaQuadrado);
    }
}
