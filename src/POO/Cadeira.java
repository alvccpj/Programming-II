package POO;
public class Cadeira {
    String cor, tipoDeMaterial;
    double altura, largura, comprimento;
    boolean temRodinha;

    void moverSe() {
        if (temRodinha == true) {
            System.out.println("A cadeira está se movendo");
        }
    }
}
