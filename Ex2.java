import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int angulo;
        System.out.println("digite o valor do angulo");
        angulo = in.nextInt();

        if (angulo == 90) {
            System.out.println(" Angulo reto");                   
        }
        else if (angulo > 90) {
            System.out.println("Angulo obtuso ");            
        } else { 
            System.out.println("Angulo agudo");
        }
    }
    
}
