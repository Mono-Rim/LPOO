package Model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String razaoSocial;
    private String nomeFantasia;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa() {
    }

    public Empresa(String nome, String razaoSocial, String nomeFantasia) {
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "\nEmpresa{" +
                "nome='" + nome + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", funcionarios=" + funcionarios +
                '}';
    }
}
