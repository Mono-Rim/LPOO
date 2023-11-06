package controller;
import model.Aluno;
import model.ProdutoComparator;
import java.util.*;
public class alunoController {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(3,756764);
        Aluno aluno4 = new Aluno(4,254287);
        Aluno aluno5 = new Aluno(5,98799,"Ana", "Gocthel", "amendes@gmail.com");
        Aluno aluno6 = new Aluno(6,765775,"Patrick", "Estrela", "pestrela@gmail.com");

        aluno3.setNome("Valdir");
        aluno3.setSobrenome("Ferraz");
        aluno3.setEmail("vferraz@gmail.com");
        aluno4.setNome("Bob");
        aluno4.setSobrenome("Esponja");
        aluno4.setEmail("besponja@gmail.com");

        System.out.println(aluno1.toString() + "\n");
        System.out.println(aluno2.toString() + "\n");
        System.out.println(aluno3.toString() + "\n");
        System.out.println(aluno4.toString() + "\n");
        System.out.println(aluno5.toString() + "\n");
        System.out.println(aluno6.toString() + "\n");

        aluno1.setId(1);
        aluno1.setCpf(12345);
        aluno1.setNome("Robson");
        aluno1.setSobrenome("Souza");
        aluno1.setEmail("rsouza@gmail.com");
        aluno2.setId(2);
        aluno2.setCpf(5435);
        aluno2.setNome("Junior");
        aluno2.setSobrenome("Freitas");
        aluno2.setEmail("jfreitas@gmail.com");

        System.out.println(aluno1.getId());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail() + "\n");
        System.out.println(aluno2.getId());
        System.out.println(aluno2.getCpf());
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getSobrenome());
        System.out.println(aluno2.getEmail() + "\n");


        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        System.out.println(alunos + "\n \n");

        Map<String, Aluno> alunosMap = new HashMap<>();
        alunosMap.put(String.valueOf(aluno1.getId()), aluno1);
        alunosMap.put(String.valueOf(aluno2.getId()), aluno2);
        alunosMap.put(String.valueOf(aluno3.getId()), aluno3);
        alunosMap.put(String.valueOf(aluno4.getId()), aluno4);
        alunosMap.put(String.valueOf(aluno5.getId()), aluno5);

        System.out.println(aluno5);
        System.out.println(alunosMap.get(String.valueOf(aluno5.getId())));

        Collections.sort(alunos, new ProdutoComparator());

        Collections.reverse(alunos);
        System.out.println(alunos);
    }
}
