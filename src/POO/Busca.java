package POO;

public class Busca {
    public static int buscaSequencialIterativa(int array[], int valor) {
        // Busca sequencial não precisa estar com array ordenado
        for (int i = 0; i < array.length; i++) {
            if (valor == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int buscaBinariaIterativa(int array[], int valor) {
        // Busca binária só com arrays ordenados (crescente ou decrescente)
        int inicio = 0;
        int fim = array.length - 1;
        int meio;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (array[meio] == valor) {
                return meio;
            } else if (array[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static int buscaSequencialRecursiva(int array[], int valor, int indice) {
        if (array[indice] == valor) {
            return indice;
        } else if (indice == array.length) {
            return -1;
        } else {
            return buscaSequencialRecursiva(array, valor, indice + 1);
        }
    }

    public static int buscaBinariaRecursiva(int array[], int valor, int esquerda, int direita) {
        if (direita >= esquerda) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (array[meio] == valor)
                return meio;

            // Se o elemento for menor que o valor do meio, busca na metade esquerda do
            // array
            else if (array[meio] > valor)
                return buscaBinariaRecursiva(array, valor, esquerda, meio - 1);

            // Caso contrário, busca na metade direita do array
            return buscaBinariaRecursiva(array, valor, meio + 1, direita);
        }
        return -1;
    }
}
