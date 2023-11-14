package Model;

public class Aviao extends Personagem{
    private double z=0;
    public Aviao(){
        super();
    }

    public Aviao(double x, double y, double z){
        super(x,y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("\n Desenhou um aviao");
    }

    public void mover(double x, double y, double z){
        System.out.println("\n Moveu um aviao 3D");
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
