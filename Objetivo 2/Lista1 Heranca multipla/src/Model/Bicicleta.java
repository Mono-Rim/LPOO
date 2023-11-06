package Model;

public class Bicicleta extends Veiculo{

    private int tamanhoRoda;
    private String chassi;

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(int tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "\nBicicleta{" +
                "tamanhoRoda=" + tamanhoRoda +
                ", chassi='" + chassi + ", numero de eixos:" + getNumeroDeEixos() +
                ",propulsao:" + getPropulsao() + ", marca:" + getMarca() + ", modelo:"
                + getModelo() + ", ano de fabricação:" + getAnoFabricacao() +
                "}";
    }
}
