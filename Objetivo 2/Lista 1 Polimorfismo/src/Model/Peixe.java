package Model;

public class Peixe extends Animal{

    private double z=0;

    public Peixe() {
        super();
    }

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void mover(double x, double y, double z){
        System.out.println("\nMoveu um Peixe.");
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Override
    public void desenhar() {
        System.out.println("\n Desenhou um Peixe");
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
