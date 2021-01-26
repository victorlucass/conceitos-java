import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
    /*
        Estrutura opcional ao if-else quando se deseja decidir um Valor com base um condição.

        (condição) ? valor_se_verdadeiro : valor_se_falso;
    */

    public static void exemploCondicaoTernaria(){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o preço: ");
        int preco = input.nextInt();
        input.close();


        int desconto = (preco >= 100) ? (int) (preco * 0.10) : preco * 0;

        int precoDesconto = preco-desconto;

        System.out.println("Valor com desconto ficou: R$" + precoDesconto);
    }
}
