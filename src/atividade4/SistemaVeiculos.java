package atividade4;

import java.util.Scanner;

class SistemaVeiculos {
    private static String modelos[] = new String[100];
    private static String placas[] = new String[100];
    private static int quantidadeVeiculos = 0;
    private static Scanner in = new Scanner(System.in);

    public static void cadastrarVeiculo() {
        System.out.println("---Cadastro de Veículo---");
        if (quantidadeVeiculos < 100) {
            System.out.print("Digite o modelo do veículo: ");
            String modelo = in.nextLine();
            System.out.print("Digite a placa do veículo: ");
            String placa = in.nextLine();

            modelos[quantidadeVeiculos] = modelo;
            placas[quantidadeVeiculos] = placa;
            quantidadeVeiculos++;

            System.out.println("Veículo cadastrado com sucesso!");
        } else {
            System.out.println("O cadastro de veículos chegou ao limite!");
        }

    }

    public static void consultarVeiculo() {
        System.out.println("---Consulta de Veículo---");
        System.out.print("Digite a placa do veículo: ");
        String placa = in.nextLine();

        int indice = consultarVeiculoAux(placa, 0);

        if (indice != -1) {
            System.out.println("Veículo encontrado:");
            System.out.println("Modelo: " + modelos[indice]);
            System.out.println("Placa: " + placas[indice]);
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }

    public static int consultarVeiculoAux(String placa, int indice) {
        if (indice >= quantidadeVeiculos) {
            return -1;
        } else if (placas[indice].equalsIgnoreCase(placa)) {
            return indice;
        } else {
            return consultarVeiculoAux(placa, indice + 1); // Chamada recursiva
        }
    }

    public static void listarVeiculos() {
        System.out.println("---Lista de Veículos---");
        if (quantidadeVeiculos == 0) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }

        for (int i = 0; i < quantidadeVeiculos; i++) {
            System.out.println("Veículo " + (i + 1) + ":");
            System.out.println("Modelo: " + modelos[i]);
            System.out.println("Placa: " + placas[i]);
            System.out.println();
        }
    }

    public static void ordenarVeiculos() {
        System.out.println("---Ordenar Veículos---");
        System.out.println("Ordenar por: ");
        System.out.println("A. Modelo");
        System.out.println("B. Placa");
        System.out.print("Escolha uma opção: ");
        String opcao = in.nextLine();

        switch (opcao.toUpperCase()) {
            case "A":
                Ordenacao.bubbleSort(modelos, placas);
                System.out.println("Veículos ordenados por modelo.");
                break;
            case "B":
                Ordenacao.bubbleSort(placas, modelos);
                System.out.println("Veículos ordenados por placa.");
                break;
            default:
                System.out.println("Opção inválida. Voltando ao menu principal.");
        }
    }
}
