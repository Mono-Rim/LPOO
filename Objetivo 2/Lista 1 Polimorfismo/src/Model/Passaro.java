package Model;

public class Passaro extends Animal{

    private double z=0;

    public Passaro() {
        super();
    }

    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void mover(double x, double y, double z){
        System.out.println("\nMoveu um Passaro.");
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("\n Desenhou um Passaro");
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
