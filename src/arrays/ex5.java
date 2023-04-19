package arrays;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        int array [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        function(array, 0);
    }

    public static void function (int array [], int tamanho) {
        for (tamanho = 0; tamanho < array.length; tamanho++) {
            if (array[tamanho] % 2 == 0) {
                System.out.println(array[tamanho]); 
            }
        }
    }
}
