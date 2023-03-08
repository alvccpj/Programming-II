import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int array[] = new int[10];
        int maiorNumero = buscaMaior(array);

        System.out.println("A posição do maior elemento é de índice " + maiorNumero);

    }

    public static int buscaMaior(int array[]) {
        Scanner in = new Scanner(System.in);
        int maior = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Informe o elemento de índice " + i + ": ");
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maior]) {
                maior = i;
            }
        }

        return maior;
    }

}
