package listaMatrizes;
import java.util.Scanner;

public class a6 {
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

        // Lê as colunas que serão trocadas
        System.out.print("Informe as colunas que serão trocadas (separadas por espaço): ");
        int coluna1 = input.nextInt();
        int coluna2 = input.nextInt();

        // Troca as colunas
        for (int i = 0; i < matriz.length; i++) {
            int temp = matriz[i][coluna1];
            matriz[i][coluna1] = matriz[i][coluna2];
            matriz[i][coluna2] = temp;
        }

        // Imprime a matriz com as colunas trocadas
        System.out.println("Matriz com as colunas trocadas:");
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
