package POO;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class buscaMain {

    public static void insertionSort(int[] array) {
        int n = array.length;
        int i = 0, j = 1, aux = 0;

        while (j < n) {
            aux = array[j];
            i = j - 1;

            while ((i >= 0) && (array[i] > aux)) {
                array[i + 1] = array[i];
                i = i - 1;
            }

            array[i + 1] = aux;
            j = j + 1;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Busca busca = new Busca();
        Random random = new Random();
        Runtime runtime = Runtime.getRuntime();

        int tamanhoArrayA = (int) Math.pow(10, 6);
        int arrayA[] = new int[tamanhoArrayA];
        int tamanhoArrayB = 5000;
        int arrayB[] = new int[tamanhoArrayB];

        for (int i = 0; i < tamanhoArrayA; i++) {
            arrayA[i] = i + 1;
        }

        for (int i = 0; i < tamanhoArrayB; i++) {
            arrayB[i] = i + 1;
        }

        // ordenando crescente
        insertionSort(arrayA);
        insertionSort(arrayB);

        System.out.println("Primeiros 10 elementos do array de 1.000.000:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arrayA[i] + " ");
        }

        System.out.println();

        System.out.print("Informe o valor que você procura: ");
        int valor = in.nextInt();

        System.out.println("Primeiros 10 elementos do array de 5.000:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arrayB[i] + " ");
        }

        System.out.println();

        System.out.print("Informe o valor que você procura: ");
        int valor2 = in.nextInt();

        long tempoInicial = System.currentTimeMillis();
        long memoriaInicial = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Busca Sequencial Iterativa de A: " + Busca.buscaSequencialIterativa(arrayA, valor));
        System.out.println("Busca Sequencial Iterativa de B: " + Busca.buscaSequencialIterativa(arrayB, valor2));
        System.out.println("Busca Binária Iterativa de A: " + Busca.buscaBinariaIterativa(arrayA, valor));
        System.out.println("Busca Binária Iterativa de B: " + Busca.buscaBinariaIterativa(arrayB, valor2));
        System.out.println("Busca Sequencial Recursiva de A: " + Busca.buscaSequencialRecursiva(arrayA, valor, 0));
        System.out.println("Busca Sequencial Recursiva de B: " + Busca.buscaSequencialRecursiva(arrayB, valor2, 0));
        System.out.println(
                "Busca Binária Recursiva de A: " + Busca.buscaBinariaRecursiva(arrayA, valor, 0, arrayA.length));
        System.out.println(
                "Busca Binária Recursiva de B: " + Busca.buscaBinariaRecursiva(arrayB, valor2, 0, arrayB.length));

        long tempoFinal = System.currentTimeMillis();
        long tempoTotal = tempoFinal - tempoInicial;
        System.out.println("Tempo de execução: " + tempoTotal + " milissegundos");

        long memoriaFinal = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = memoriaFinal - memoriaInicial;
        System.out.println("Memória utilizada: " + memoryUsed + " bytes");

    }

}
