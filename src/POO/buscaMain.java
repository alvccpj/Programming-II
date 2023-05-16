package POO;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class buscaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Busca busca = new Busca();
        Random random = new Random();

        int tamanhoArray = (int) Math.pow(10, 1);
        int array[] = new int[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++) {
            array[i] = random.nextInt(); 
        }

        Arrays.sort(array); //ordenar crescente

        System.out.println("Primeiros 10 elementos do array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        

        System.out.println();

        System.out.print("Informe o valor que você procura: ");
        int valor = in.nextInt();
        System.out.println(Busca.buscaSequencialIterativa(array, valor));
        //System.out.println(Busca.buscaBinariaIterativa(array, valor));
        //System.out.println(Busca.buscaSequencialRecursiva(array, valor, 0));
        //System.out.println(Busca.buscaBinariaRecursiva(array, valor, 0, array.length));

        
        
    }

    
}
