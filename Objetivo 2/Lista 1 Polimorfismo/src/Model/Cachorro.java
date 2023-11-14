package Model;

public class Cachorro extends Animal{

    public Cachorro() {
        super();
    }

    public Cachorro(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("\n Desenhou um Cachorro");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
