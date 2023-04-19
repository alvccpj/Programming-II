package doubleArrays;
import java.util.Scanner;
public class matrix {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe quantas linhas você quer na matriz: ");
        int x = in.nextInt();
        System.out.print("Informe quantas colunas você quer na matriz: ");
        int y = in.nextInt();
        int matriz[][] = new int[x][y];
        preencher(matriz);
        imprime(matriz);
    }

    public static void preencher(int matriz[][]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o valor para a linha " + i + " e a coluna " + j + ": ");
                matriz[i][j] = in.nextInt();
            }
        }
    }

    public static void imprime(int matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}