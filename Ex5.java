import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int  valor, notas100, notas50, notas20, notas10, notas5, notas2, notas1, resto;

        System.out.println("Digite o valor do numero inteiro:");
        valor = in.nextInt();

        notas100 = valor / 100;
        resto = valor % 100;
        
        notas50 = resto / 50;
        resto = resto % 50;
        
        notas20 = resto / 20;
        resto = resto % 20;

        notas10 = resto / 10;
        resto = resto %10;

        notas5 = resto / 5;
        resto = resto % 5;

        notas2 = resto / 2;
        resto = resto % 2;

        notas1 = resto /1;


        System.out.println("notas 100 = "+notas100);
        System.out.println("notas 50 = "+notas50);
        System.out.println("notas 20 = "+notas20);
        System.out.println("notas 10 = "+notas10);
        System.out.println("notas 5 = "+notas5);
        System.out.println("notas 2 = "+notas2);
        System.out.println("notas 1 = "+notas1);

    }
    
}
