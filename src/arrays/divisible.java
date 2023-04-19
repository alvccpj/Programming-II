package arrays;
import java.util.Scanner;

public class divisible {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n1, n2;
        System.out.println("Programa para saber se o primeiro número é divisível pelo segundo!");
        System.out.print("Informe o primeiro número: ");
        n1 = in.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = in.nextInt();
        function(n1, n2);

    }

    public static boolean function(int n1, int n2) {
        if (n1 % n2 == 0) {
            System.out.println("O primeiro número é divisível pelo segundo número!");
            return true;
        } else {
            System.out.println("O primeiro número não é divisível pelo segundo número!");
            return false;
        }
    }
}
