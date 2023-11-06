package Model;

 public abstract class Funcionario {
     public Funcionario() {

     }

     public double getBonus() {
         return bonus;
     }

     public Funcionario(String nome, double salario, double bonus) {
         this.nome = nome;
         this.salario = salario;
         this.bonus = bonus;
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

     private String nome = "Valdir";
     private double salario = 100.00;
     private double bonus = 1;

     @Override
     public String toString() {
         return "Funcionario{" +
                 "nome='" + nome + '\'' +
                 ", salario=" + salario +
                 ", bonus=" + getBonus() +
                 "}\n";
     }



}
