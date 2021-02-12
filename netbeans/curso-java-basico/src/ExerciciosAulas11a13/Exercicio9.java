package ExerciciosAulas11a13;
import java.util.Scanner;
public class Exercicio9 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double tempFahrenheit = scan.nextDouble();
        double tempCelsius = (5 * (tempFahrenheit - 32) / 9);
        System.out.println("A temperatura em Celcius é de: " + tempCelsius + "°C");
    }
}
