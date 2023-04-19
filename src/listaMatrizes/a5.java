package listaMatrizes;
import java.util.Scanner;
public class a5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lê a dimensão da matriz
        System.out.print("Informe a dimensão da matriz (linhas x colunas): ");
        int linhas = input.nextInt();
        int colunas = input.nextInt();

        // Cria a matriz e lê os valores
        int[][] matriz = new int[linhas][colunas];
        System.out.println("Informe os valores da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

        // Imprime a matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Lê as linhas que serão trocadas
        System.out.print("Informe as linhas que serão trocadas: ");
        int linha1 = input.nextInt();
        int linha2 = input.nextInt();

        // Troca as linhas
        int[] temp = matriz[linha1];
        matriz[linha1] = matriz[linha2];
        matriz[linha2] = temp;

        // Imprime a matriz com as linhas trocadas
        System.out.println("Matriz com as linhas trocadas:");
        imprimirMatriz(matriz);

        input.close();
    }

    // Método para imprimir uma matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
