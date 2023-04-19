package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class arrayTest {
    public static void main(String[] args) throws Exception {
        int vetA[] = new int[3];
        int vetB[] = new int[3];
        somaVetores(vetA, vetB);
        produtoEscalar(vetA, vetB);
    }

    public static int[] somaVetores(int[] vetA, int[] vetB) {
        Scanner in = new Scanner(System.in);
        int tamanho = vetA.length;
        int[] resultado = new int[tamanho];

        if (vetA.length != vetB.length) {
            System.out.println("Os vetores devem ter o mesmo tamanho para realizar a soma");
        }

        else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Informe um número inteiro para o vetor A de índice " + i + ": ");
                vetA[i] = in.nextInt();
                System.out.print("Informe um número inteiro para o vetor B de índice " + i + ": ");
                vetB[i] = in.nextInt();
                resultado[i] = vetA[i] + vetB[i];
            }
        }
        System.out.println("Soma dos Vetores: ");
        System.out.println(Arrays.toString(resultado));
        return resultado;
    }

    public static int produtoEscalar(int vetA[], int vetB[]) {
        int tamanho = vetA.length;
        int produto = 0;

        if (vetA.length != vetB.length) {
            System.out.println("Os vetores devem ter o mesmo tamanho para calcular o produto escalar");
        }

        else {
            for (int i = 0; i < tamanho; i++) {
                produto += vetA[i] * vetB[i];
            }
        }

        System.out.println("Produto Escalar: ");
        System.out.println(produto);
        return produto;
    }

}
