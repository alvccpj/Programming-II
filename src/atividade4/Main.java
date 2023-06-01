package atividade4;

import java.util.Scanner;

class Main {

    private static void exibirMenu() {
        System.out.println("--------Menu---------");
        System.out.println("1 - Cadastrar veículo");
        System.out.println("2 - Consultar veículo");
        System.out.println("3 - Listar veículos");
        System.out.println("4 - Ordenar veículos");
        System.out.println("0 - Sair do programa");
        System.out.print("Escolha uma opção: ");
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        SistemaVeiculos sistemaVeiculos = new SistemaVeiculos();
        int opcao;

        do {
            exibirMenu();
            opcao = in.nextInt();
            in.nextLine();

            try {
                switch (opcao) {
                    case 1:
                        sistemaVeiculos.cadastrarVeiculo();
                        break;
                    case 2:
                        sistemaVeiculos.consultarVeiculo();
                        break;
                    case 3:
                        sistemaVeiculos.listarVeiculos();
                        break;
                    case 4:
                        sistemaVeiculos.ordenarVeiculos();
                        break;
                    case 0:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ocorreu um erro: Índice fora do intervalo válido.");
            }
        } while (opcao != 0);
    }
}