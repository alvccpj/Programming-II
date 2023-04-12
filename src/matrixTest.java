public class matrixTest {
    public static void main(String[] args) throws Exception {
        double matrizA[][] = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        double matrizB[][] = { { 5.0, 6.0 }, { 7.0, 8.0 } };
        int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        double matrix[][] = { { -1, 2, 0 }, { 3, -4, 5 } };
        int k = 3;
        calculaProdInterno(matrizA, matrizB);
        calculaSoma(matriz, k);
        relu(matrix);
    }

    public static double[][] calculaProdInterno(double matrizA[][], double matrizB[][]) {
        int linhas = matrizA.length;
        int colunas = matrizA[0].length;
        double resultado[][] = new double[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matrizA[i][j] * matrizB[i][j];
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
        return resultado;
    }

    public static int calculaSoma(int matriz[][], int k) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int soma = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] > k) {
                    soma += matriz[i][j];
                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println();
            System.out.println();
        }
        return soma;
    }

    public static double[][] relu(double matriz[][]) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        double resultado[][] = new double[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = Math.max(0, matriz[i][j]);
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }

        return resultado;
    }
}
