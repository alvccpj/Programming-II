package listaMatrizes;
public class a4 {
    public static void main(String[] args) {
        // Cria a matriz e inicializa com alguns valores
        int[][] matriz = { { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 } };

        System.out.println("Matriz: ");
        imprimirMatriz(matriz);

        // Verifica se a matriz é uma matriz identidade
        boolean isIdentidade = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j && matriz[i][j] != 1) {
                    isIdentidade = false;
                } else if (i != j && matriz[i][j] != 0) {
                    isIdentidade = false;
                }
            }
        }
        
        // Imprime o resultado
        if (isIdentidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz não é uma matriz identidade.");
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
