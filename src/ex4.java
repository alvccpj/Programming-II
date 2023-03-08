import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        double array[] = { 1.4, 2.2, 3.7, 4.6, 5.1, 6.1, 7.9, 8.3, 9.1, 10.4 };

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
