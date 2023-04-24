package POO;

public class Main {

    public static void exibir(Cadeira cadeira1) {
        // exibindo os valores do atributos do objeto
        System.out.println("A cor da cadeira 1 é: " + cadeira1.cor);
        System.out.println(
                "O tamanho dela é: " + cadeira1.altura + " x " + cadeira1.comprimento + " x " + cadeira1.largura);
        System.out.println("O tipo de material: " + cadeira1.tipoDeMaterial);
        if (cadeira1.temRodinha) {
            System.out.println("A cadeira tem rodinha");
        } else {
            System.out.println("A cadeira não tem rodinha");
        }

        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        // instanciando o objeto 'cadeira' da classe Cadeira
        Cadeira cadeira1 = new Cadeira();
        Cadeira cadeira2 = new Cadeira();
        Cadeira cadeira3 = new Cadeira();
        Cadeira cadeira4 = new Cadeira();

        // atribuindo valores aos atributos da classe
        cadeira1.cor = "Azul";
        cadeira1.altura = 1.10;
        cadeira1.comprimento = 0.5;
        cadeira1.largura = 0.7;
        cadeira1.tipoDeMaterial = "Ouro";
        cadeira1.temRodinha = true;

        cadeira2.cor = "Verde";
        cadeira2.altura = 1.20;
        cadeira2.comprimento = 0.7;
        cadeira2.largura = 0.4;
        cadeira2.tipoDeMaterial = "Prata";
        cadeira2.temRodinha = false;

        cadeira3.cor = "Roxa";
        cadeira3.altura = 1.50;
        cadeira3.comprimento = 0.6;
        cadeira3.largura = 0.8;
        cadeira3.tipoDeMaterial = "Bronze";
        cadeira3.temRodinha = true;

        cadeira4.cor = "Preta";
        cadeira4.altura = 1.80;
        cadeira4.comprimento = 0.3;
        cadeira4.largura = 0.9;
        cadeira4.tipoDeMaterial = "Plástico";
        cadeira4.temRodinha = false;

        exibir(cadeira1);
        exibir(cadeira2);
        exibir(cadeira3);
        exibir(cadeira4);

    }
}
