package POO;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class buscaMain {

    public static void medirTempoEMemoria(Runnable runnable) {
        Runtime runtime = Runtime.getRuntime();

        long tempoInicial = System.currentTimeMillis();
        long memoriaInicial = runtime.totalMemory() - runtime.freeMemory();

        runnable.run();

        long tempoFinal = System.currentTimeMillis();
        long memoriaFinal = runtime.totalMemory() - runtime.freeMemory();

        long tempoExecucao = tempoFinal - tempoInicial;
        long memoriaUtilizada = memoriaFinal - memoriaInicial;

        System.out.println("Tempo de execução (ms): " + tempoExecucao);
        System.out.println("Memória utilizada (bytes): " + memoriaUtilizada);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Busca busca = new Busca();
        Runtime runtime = Runtime.getRuntime();

        int arrayA[] = new int[5000];
        for (int i = 0; i < arrayA.length - 1; i++) {
            arrayA[i] = i + 1;
        }

        int arrayB[] = new int[10000];
        for (int i = 0; i < arrayB.length - 1; i++) {
            arrayB[i] = i + 1;
        }

        System.out.print("Digite um valor para buscar no array A: ");
        int valorBuscaA = in.nextInt();

        medirTempoEMemoria(() -> {
            int resultadoBuscaSequencialIterativaA = Busca.buscaSequencialIterativa(arrayA, valorBuscaA);
            System.out.println(
                    "Resultado da busca sequencial iterativa no array A: " + resultadoBuscaSequencialIterativaA);
        });

        medirTempoEMemoria(() -> {
            int resultadoBuscaBinariaIterativaA = Busca.buscaBinariaIterativa(arrayA, valorBuscaA);
            System.out.println("Resultado da busca binária iterativa no array A: " + resultadoBuscaBinariaIterativaA);
        });

        medirTempoEMemoria(() -> {
            int resultadoBuscaSequencialRecursivaA = Busca.buscaSequencialRecursiva(arrayA, valorBuscaA);
            System.out.println(
                    "Resultado da busca sequencial recursiva no array A: " + resultadoBuscaSequencialRecursivaA);
        });

        medirTempoEMemoria(() -> {
            int resultadoBuscaBináriaRecursivaA = Busca.buscaBinariaRecursiva(arrayA, valorBuscaA);
            System.out.println("Resultado da busca binária recursiva no array A: " + resultadoBuscaBináriaRecursivaA);
        });

        System.out.print("Digite um valor para buscar no array B: ");
        int valorBuscaB = in.nextInt();

        medirTempoEMemoria(() -> {
            int resultadoBuscaSequencialIterativaB = Busca.buscaSequencialIterativa(arrayB, valorBuscaB);
            System.out.println(
                    "Resultado da busca sequencial iterativa no array B: " + resultadoBuscaSequencialIterativaB);
        });

        medirTempoEMemoria(() -> {
            int resultadoBuscaBinariaIterativaB = Busca.buscaSequencialIterativa(arrayB, valorBuscaB);
            System.out.println("Resultado da busca binária iterativa no array B: " + resultadoBuscaBinariaIterativaB);
        });

        medirTempoEMemoria(() -> {
            int resultadoBuscaSequencialRecursivaB = Busca.buscaSequencialRecursiva(arrayB, valorBuscaB);
            System.out.println(
                    "Resultado da busca sequencial recursiva no array A: " + resultadoBuscaSequencialRecursivaB);
        });

        medirTempoEMemoria(() -> {
            int resultadoBuscaBináriaRecursivaB = Busca.buscaBinariaRecursiva(arrayB, valorBuscaB);
            System.out.println("Resultado da busca binária recursiva no array A: " + resultadoBuscaBináriaRecursivaB);
        });
    }
}
