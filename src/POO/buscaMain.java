package POO;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class buscaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Busca busca = new Busca();
        Random random = new Random();
        Runtime runtime = Runtime.getRuntime();

        int tamanhoArray = (int) Math.pow(10, 6);
        int array[] = new int[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++) {
            array[i] = random.nextInt();
        }

        Arrays.sort(array); // ordenar crescente

        System.out.println("Primeiros 10 elementos do array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.print("Informe o valor que você procura: ");
        int valor = in.nextInt();

        long tempoInicial = System.currentTimeMillis();
        long memoriaInicial = runtime.totalMemory() - runtime.freeMemory();

        // System.out.println(Busca.buscaSequencialIterativa(array, valor));
        // System.out.println(Busca.buscaBinariaIterativa(array, valor));
        System.out.println(Busca.buscaSequencialRecursiva(array, valor, 0));
        //System.out.println(Busca.buscaBinariaRecursiva(array, valor, 0, array.length));

        long tempoFinal = System.currentTimeMillis();
        long tempoTotal = tempoFinal - tempoInicial;
        System.out.println("Tempo de execução: " + tempoTotal + " milissegundos");

        long memoriaFinal = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = memoriaFinal - memoriaInicial;
        System.out.println("Memória utilizada: " + memoryUsed + " bytes");

        try {
            
        }catch (StackOverflowError e){

        }
    }

}
