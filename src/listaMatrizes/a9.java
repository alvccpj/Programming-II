package listaMatrizes;
public class a9 {
    public static void main(String[] args) {

        // Cria e inicializa a matriz
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        imprimirMatriz(matriz);
        // Calcula a soma dos elementos acima da diagonal principal
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }

        // Imprime o resultado
        System.out.println("A soma dos elementos acima da diagonal principal é: " + soma);

    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
