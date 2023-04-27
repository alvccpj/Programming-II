package POO;
public class Main {
    public static void main(String[] args) throws Exception {
        // intanciando o objeto 'cadeira' da classe Cadeira
        Cadeira cadeira = new Cadeira("Verde", 1.5, true);
        Cadeira cadeira2 = new Cadeira("Roxa", 1.3, false);

        exibir(cadeira);
        exibir(cadeira2);

    }

    public static void exibir(Cadeira cadeira) {
        // exibindo os valores do atributos do objeto
        System.out.println("A cor da cadeira é: " + cadeira.cor);
        System.out.println(
                "O tamanho dela é: " + cadeira.tamanho);
        if (cadeira.temRodinha) {
            System.out.println("A cadeira tem rodinha");
            cadeira.moverSe();
        } else {
            System.out.println("A cadeira não tem rodinha");
        }

        System.out.println();
    }
}
