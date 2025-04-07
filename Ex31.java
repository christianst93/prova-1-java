import java.util.Scanner;

public class Ex31 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float x1, x2, x3, x4, y1, y2, y3, y4;

        System.out.println("Digite o valor das coordendas do retangulo 1 (x1, y1, x2, y2):");
        x1 = in.nextFloat();
        y1 = in.nextFloat();
        x2 = in.nextFloat();
        y2 = in.nextFloat();

        System.out.println("Digite o valor das coordendas do retangulo 2 (x3, y3, x4, y4):");
        x3 = in.nextFloat();
        y3 = in.nextFloat();
        x4 = in.nextFloat();
        y4 = in.nextFloat();

        if (x1 >= x3 &&  y1 >= y3 && x2 <= x4 && y2 <= y4)
         {
            System.out.println("dentro");
        }
        else if (x1 == x3 &&  y1 == y3 && x2 == x4 && y2 == y4) {
            System.out.println("Sobreposto");
        }
        else if (x1 == x3 ||  y1 == y3 || x2 == x4 || y2 == y4) {
            System.out.println("Encostando");
        } else {
            System.out.println("Fora");
        }
    }
}
