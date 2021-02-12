package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio7 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = scan.nextDouble();
        if (num1 > num2 && num2 > num3){
        System.out.println("O maior número digitado é o primeiro número: " + num1);
        System.out.println("O menor número digitado é o terceiro número: " + num3);
    }else if (num1 > num2 && num2 < num3 && num1 > num3){
        System.out.println("O maior número digitado é o primeiro número: " + num1);
        System.out.println("O menor número digitado é o segundo número: " + num2);
    }else if(num1 < num2 && num2 > num3 && num1 > num3){
        System.out.println("O maior número digitado é o segundo número: " + num2);
        System.out.println("O menor número digitado é o terceiro número: " + num3);
    }else if(num1 > num2 && num2 < num3 && num1 < num3){
        System.out.println("O maior número digitado é o terceiro número: " + num3);
        System.out.println("O menor número digitado é o segundo número: " + num2);
    }else if (num1 < num2 && num2 > num3 && num1 < num3){
        System.out.println("O maior número digitado é o segundo número: " + num2);
        System.out.println("O menor número digitado é o primeiro número: " + num1);
    }else if (num1 < num2 && num2 < num3){
        System.out.println("O maior número digitado é o terceiro número: " + num3);
        System.out.println("O menor número digitado é o primeiro número: " + num1);
    }else if (num1 == num2 && num2 > num3){
        System.out.println("O maior número digitado é o primeiro e segundo número: " + num1 + " e " + num2);
        System.out.println("O menor número digitado é o terceiro número: " + num3);
    }else if (num1 == num2 && num2 == num3){
        System.out.println("Os números dititados são iguais!" + num1 + " = " + num2 + " = " + num3);
    }else if (num1 == num2 && num2 < num3){
        System.out.println("O maior número digitado é o terceiro número: " + num3);
        System.out.println("O menor número digitado é o primeiro e segundo número: " + num1 + " e " + num2);
    }else if (num1 < num2 && num2 == num3){
        System.out.println("O maior número digitado é o segundo e o terceiro número: " + num2 + " e " + num3);
        System.out.println("O menor número digitado é o primeiro número: " + num1);
    }else if (num1 > num2 && num2 == num3){
        System.out.println("O maior número digitado é o primeiro número: " + num1);
        System.out.println("O menor número digitado é o segundo e o terceiro número: " + num2 + " e " + num3); 
    }else if (num1 < num2 && num2 > num3 && num1 == num3){
        System.out.println("O maior número digitado é o segundo número: " + num2);
        System.out.println("O menor número digitado é o primeiro e o terceiro número: " + num1 + " e " + num3); 
    }else if (num1 > num2 && num2 < num3 && num1 == num3){
        System.out.println("O maior número digitado é o primeiro e o terceiro número: " + num1 + " e " + num3);
        System.out.println("O menor número digitado é o segundo número: " + num2); 
    }
    }
}
