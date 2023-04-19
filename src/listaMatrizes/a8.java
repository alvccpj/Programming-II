public class ex8 {
    public static void main(String[] args) {

        // Cria e inicializa a matriz
        int[][] matriz = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        imprimirMatriz(matriz);

        // Verifica se a matriz é simétrica em relação à sua diagonal principal
        boolean simetrica = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) {
                break;
            }
        }

        // Imprime o resultado
        if (simetrica) {
            System.out.println("A matriz é simétrica em relação à sua diagonal principal.");
        } else {
            System.out.println("A matriz não é simétrica em relação à sua diagonal principal.");
        }

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
