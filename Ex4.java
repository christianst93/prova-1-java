import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int pontuacao;

        System.out.println("Digite o valor da pontuação");
        pontuacao = in.nextInt();

        if (pontuacao < 50) {
            System.out.println("Desempenho abaixo do esperado. Sem bonificação.");
        }
        else if (pontuacao <= 69) {
            System.out.println("Desempenho médio. Bonificação de 5% do salário.");
        }
        else if (pontuacao <= 89) {
            System.out.println("Bom desempenho! Bonificação de 10% do salário.");
        }
        else {
           System.out.println("Excelente desempenho! Bonificação de 20% do salário."); 
        }
    }     
}