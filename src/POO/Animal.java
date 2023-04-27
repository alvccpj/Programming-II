package POO;

public class Animal {
    String nome, especie, cor;
    double tamanho;
    boolean mordePessoas;

    Animal(String n, String e, String c, double t, boolean m) {
        this.nome = n;
        this.especie = e;
        this.cor = c;
        this.tamanho = t;
        this.mordePessoas = m;
    }

    void mordePessoas() {
        if (this.mordePessoas) {
            System.out.println("O animal está mordendo!!!");
        }
    }
}
