package Model;

public class Navio extends Personagem{

    public Navio() {
        super();
    }

    public Navio(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("\n Desenhou um navio");
    }

    @Override
    public String toString() {
        return "Navio{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
