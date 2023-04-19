package listaMatrizes;
public class a7 {
    public static void main(String[] args) {

        // Cria e inicializa a matriz
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Inicializa as variáveis para o maior e menor elemento e suas posições
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        int linhaMaior = 0, colunaMaior = 0;
        int linhaMenor = 0, colunaMenor = 0;

        // Percorre a matriz em busca do maior e do menor elemento e de suas posições
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
                else {
                    menor = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }

        // Imprime o maior e o menor elemento e suas posições
        System.out.printf("Maior elemento: %d (linha %d, coluna %d)\n", maior, linhaMaior, colunaMaior);
        System.out.printf("Menor elemento: %d (linha %d, coluna %d)\n", menor, linhaMenor, colunaMenor);

    }
}
