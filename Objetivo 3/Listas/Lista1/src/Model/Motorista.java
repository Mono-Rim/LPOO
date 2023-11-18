package Model;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Corrida> corridas = new ArrayList<>();
    public Motorista() {
    }

    public Motorista(Long id, String nome, String email, String telefone, List<Veiculo> veiculos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.veiculos = veiculos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }

    public void setCorridas(List<Corrida> corridas) {
        this.corridas = corridas;
    }

    @Override
    public String toString() {
        return "\nMotorista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", veiculos=" + veiculos +
                '}';
    }
}
