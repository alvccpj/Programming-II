package POO;

public class Main2 {
    public static void main(String[] args) {
        Animal a = new Animal("ret", "cachorro", "branca", 1.5, true);
        exibir(a);
    }

    public static void exibir(Animal a) {
        System.out.println("O nome do animal é: " + a.nome);
        System.out.println("A espécie do animal é: " + a.especie);
        System.out.println("A cor do animal é: " + a.cor);
        if (a.mordePessoas) {
            System.out.println("O cachorro morde pessoas");
            a.mordePessoas();
        } else {
            System.out.println("O cachorro não morde pessoas");

        }
    }
}
