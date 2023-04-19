public class ex3 {
    public static void main(String[] args) {
        // Cria a matriz e inicializa com alguns valores
        int[][] matriz = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        // Imprime a matriz
        System.out.println("Matriz:");
        imprimirMatriz(matriz);

        // Imprime os elementos da diagonal principal
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
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
