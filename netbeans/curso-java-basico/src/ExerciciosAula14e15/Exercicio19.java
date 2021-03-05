package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio19 {
    public static void main (String[] args){
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();
        
        System.out.println("Qual operação você deseja realizar?"
                + "(*)multiplicação, (/)divisão, (+)soma e (-) subtração");
        String operacao = scan.next();
        
        double resultado = 0;
        boolean valida = true;
        
        switch (operacao){
            case "*": resultado = num1 * num2; break;
            case "/": resultado = num1 / num2; break;
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            default:
                System.out.println("Digite uma opção válida!");
                valida = false;
            }
        
        if (valida) {
            
            System.out.println("Resultado: " + resultado);
            
            if (resultado >= 0){
            System.out.println("Resultado é positivo.");
        }else{
            System.out.println("Resultado é negativo.");
        }
        
        if (resultado % 2 == 0){
            System.out.println("Resultado é par.");
        }else{
            System.out.println("Resultado é impar");            
        }
        }
    }
}
