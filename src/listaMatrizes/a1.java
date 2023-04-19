package listaMatrizes;
public class a1 {
    public static void main(String[] args) throws Exception {
        int matriz[][] = { {1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12} };

        double soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                soma += matriz[i][j];
            }
        }

        double media = soma / (matriz.length * matriz[0].length);
        System.out.println("Média dos valores: " + media);
    }
}
