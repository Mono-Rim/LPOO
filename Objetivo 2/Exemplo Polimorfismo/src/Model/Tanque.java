package Model;

public class Tanque extends Personagem{

    public Tanque(){
        super();
    }

    public Tanque(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("\nDesenhou um tanque");
    }

    @Override
    public String toString() {
        return "Tanque{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
