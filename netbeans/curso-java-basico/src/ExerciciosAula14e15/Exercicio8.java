package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o preço do produto 1: ");
        double produto1 = scan.nextDouble();
        System.out.println("Digite o preço do produto 2: ");
        double produto2 = scan.nextDouble();
        System.out.println("Digite o preço do produto 3: ");
        double produto3 = scan.nextDouble();
        if (produto1 > produto2 && produto2 > produto3){
            System.out.println("Compre o produto 3, pois é o mais barato!");
        }else if(produto1 > produto2 && produto2 < produto3){
            System.out.println("Compre o produto 2, pois é o mais barato!");
        }else if(produto1 < produto2 && produto2 > produto3 && produto1 > produto3){
            System.out.println("Compre o produto 3, pois é o mais barato!");
        }else if(produto1 < produto2 && produto2 > produto3 && produto1 < produto3){
            System.out.println("Compre o produto 1, pois é o mais barato!");
        }
    }
    
}
