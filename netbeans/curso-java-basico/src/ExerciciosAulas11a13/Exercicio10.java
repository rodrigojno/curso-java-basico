package ExerciciosAulas11a13;
import java.util.Scanner;
public class Exercicio10 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double tempCelsius = scan.nextDouble();
        double tempFahrenheit = ((tempCelsius * 9 / 5) +32);
        System.out.println("A temperatura em Fahrenheit é: " + tempFahrenheit + "°F");
    }
}
