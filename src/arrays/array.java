package arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vet[] = new double[10];
        double soma = 0;
        double media;

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Calcule a média de 10 notas");
            System.out.print("Informe a sua " + (i + 1) + " nota: ");
            vet[i] = in.nextDouble();
        }

        for (int i = 0; i < vet.length; i++) {
            soma = soma + vet[i];
        }

        for (int i = 0; i < vet.length; i++) {
            soma = soma + vet[i];
        }

        media = soma / 10;
        System.out.println("Media: " + media);
    }
}
