package POO;
public class Cadeira {
    String cor;
    double tamanho;
    boolean temRodinha;

    Cadeira (String c, double tam, boolean tem) {
        this.cor = c;
        this.tamanho = tam;
        this.temRodinha = tem;
    }

    void moverSe() {
        if (this.temRodinha) {
            System.out.println("A cadeira está se movendo...");
        }
    }
}
