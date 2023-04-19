package arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double array[] = new double[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Informe o número de índice " + i + ": ");
            array[i] = in.nextDouble();

            if (i % 2 == 0) {
                System.out.println("Os valores de índices pares são: " + array[i]);
            }

        }

    }
}
