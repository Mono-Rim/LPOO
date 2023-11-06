package Model;

public class Carro extends Veiculo implements Automovel{

    private String renavam;
    private String chassi;
    private String placa;
    private int capacidadePortaMalas;

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public String getRenavam() {
        return renavam;
    }

    @Override
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    @Override
    public String getChassi() {
        return chassi;
    }

    @Override
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "\nCarro{" +
                "renavam='" + renavam + '\'' +
                ", chassi='" + chassi + '\'' +
                ", placa='" + placa + '\'' +
                ", capacidadePortaMalas=" + capacidadePortaMalas + ", numero de eixos:" + getNumeroDeEixos() +
                ",propulsao:" + getPropulsao() + ", marca:" + getMarca() + ", modelo:"
                + getModelo() + ", ano de fabricação:" + getAnoFabricacao() +
                "}";
    }
}
