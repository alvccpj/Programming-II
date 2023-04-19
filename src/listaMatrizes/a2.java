public class ex2 {
    public static void main(String[] args) {
        // Define as dimensões das matrizes
        int m1 = 2;
        int n1 = 3;
        int m2 = 3;
        int n2 = 2;

        // Cria as matrizes e inicializa com alguns valores
        int[][] matriz1 = {{1, 2, 3},
                           {4, 5, 6}};

        int[][] matriz2 = {{7, 8},
                           {9, 10},
                           {11, 12}};

        // Verifica se as matrizes são compatíveis para multiplicação
        if (n1 != m2) {
            System.out.println("As matrizes não são compatíveis para multiplicação.");
            return;
        }

        // Cria a matriz resultante da multiplicação
        int[][] matrizResultado = new int[m1][n2];

        // Calcula a multiplicação das matrizes
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // Imprime as matrizes e a matriz resultante da multiplicação
        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);
        System.out.println("Matriz 2:");
        imprimirMatriz(matriz2);
        System.out.println("Matriz resultante:");
        imprimirMatriz(matrizResultado);
    }

    // Método para imprimir uma matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
