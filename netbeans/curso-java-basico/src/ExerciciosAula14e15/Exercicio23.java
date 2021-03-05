package ExerciciosAula14e15;
import java.util.Scanner;
public class Exercicio23 {
    public static void main (String[] args){
         
        Scanner scan = new Scanner (System.in);
         
        System.out.println("Escolha o tipo de carne da promoção:");
        System.out.println("1-Filé Duplo; 2-Alcatra; 3-Picanha.");
        int tipoCarne = scan.nextInt();
        
        System.out.println("Digite a quantidade de carne escolhida: ");
        double qtdeCarne = scan.nextDouble();
        
        double pagamentoCarne = 0;
        String nomeCarne = "nomeCarne";
        switch (tipoCarne) {
            case 1:
                nomeCarne = "Filé Duplo";
                if (qtdeCarne < 5){
                    pagamentoCarne = qtdeCarne * 4.9;
                }else{
                    pagamentoCarne = qtdeCarne * 5.8;
                }
                break;
            case 2:
                nomeCarne = "Alcatra";
                if (qtdeCarne < 5){
                    pagamentoCarne = qtdeCarne * 5.9;
                }else{
                    pagamentoCarne = qtdeCarne * 6.8;
                }
                break;
            case 3:
                nomeCarne = "Picanha";
                if(qtdeCarne < 5){
                    pagamentoCarne = qtdeCarne * 6.9;
                }else{
                    pagamentoCarne = qtdeCarne * 7.8;
                }
            default: break;
        }
        
        System.out.println("O pagamento é com o cartão Tabajara? Digite 1 para sim: ");
        int cartao = scan.nextInt();
               
        double desconto = 0;
        String tipoPagamento = "tipoPagamento";
        if (cartao == 1){
            desconto = pagamentoCarne * 5/100;
            pagamentoCarne = pagamentoCarne - desconto;
            tipoPagamento = "Cartão Tabajara";
        }else{
            pagamentoCarne = pagamentoCarne;
            tipoPagamento = "Em dinheiro";
        }

        System.out.println("*********** CUPOM FISCAL ***********");
        System.out.println("Tipo da carne comprada      : " + nomeCarne);
        System.out.println("Quantidade de carne comprada: " + qtdeCarne + "kg");
        System.out.println("Preço total                 : R$" + pagamentoCarne);
        System.out.println("Tipo de pagamento           : " + tipoPagamento);
        System.out.println("Valor do desconto           : R$" + desconto);
        System.out.println("Valor a pagar               : R$" + pagamentoCarne);
    }
}
