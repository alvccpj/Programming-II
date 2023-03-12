import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[] = new int[10];
        int maiorValor;
        int maiorIndice = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Informe o valor de indice " + i + ": ");
            array[i] = in.nextInt();
        }

        maiorValor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maiorValor) {
                maiorValor = array[i];
                maiorIndice = i;
            }
        }

        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("O maior indice é: " + maiorIndice);
    }
}
