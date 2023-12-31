package model;

public class Funcionario {
    private String nome = "Jorge";
    private double salario = 2000.0;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
