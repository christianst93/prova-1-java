import java.util.Scanner;

public class Ex8 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Float peso, altura, imc;
        char genero;
    
        System.out.println("Digite o genero (m) ou (f), o valor do peso e da altura");
        genero = in.next().charAt(0);
        peso = in.nextFloat();
        altura = in.nextFloat();

        imc = peso/(altura*altura);

        if (imc < 18) {
            System.out.println("Abaixo do peso.");
        }
        else if ((genero == 'm' && imc <= 25) || (genero == 'f' && imc <= 24)) {
            System.out.println("Peso normal.");
        }
        else if ((genero == 'm' && imc <= 30) || (genero == 'f' && imc <= 30)) {
            System.out.println("Sobre peso");
        }
        else if (imc >= 35 && imc <= 40) {
            System.out.println("Obesidade moderada");
        }
        else if (imc > 40) {
            System.out.println("Obesidade grave"); 
        } 
    }
}
