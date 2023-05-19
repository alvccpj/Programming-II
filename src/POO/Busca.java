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

    public static int buscaSequencialRecursiva(int[] array, int valor) {
        return buscaSequencialRecursivaAux(array, valor, 0);
    }

    public static int buscaSequencialRecursivaAux(int[] array, int valor, int indice) {
        if (indice >= array.length) {
            return -1;
        }
        if (array[indice] == valor) {
            return indice;
        }
        return buscaSequencialRecursivaAux(array, valor, indice + 1);
    }

    public static int buscaBinariaRecursiva(int[] array, int valor) {
        return buscaBinariaRecursivaAux(array, valor, 0, array.length - 1);
    }

    public static int buscaBinariaRecursivaAux(int[] array, int valor, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }
        int meio = (inicio + fim) / 2;
        if (array[meio] == valor) {
            return meio;
        } else if (array[meio] < valor) {
            return buscaBinariaRecursivaAux(array, valor, meio + 1, fim);
        } else {
            return buscaBinariaRecursivaAux(array, valor, inicio, meio - 1);
        }
    }
}
