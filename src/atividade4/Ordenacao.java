package atividade4;

class Ordenacao {
    public static void bubbleSort(String[] array1, String[] array2) {
        int n = array1.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String s1 = array1[j];
                String s2 = array1[j + 1];
                
                if (s1 != null && s2 != null && s1.compareToIgnoreCase(s2) > 0) {
                    trocarPosicao(array1, j, j + 1);
                    trocarPosicao(array2, j, j + 1);
                }
            }
        }
    }

    private static void trocarPosicao(String[] array, int indice1, int indice2) {
        String temp = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = temp;
    }
}
